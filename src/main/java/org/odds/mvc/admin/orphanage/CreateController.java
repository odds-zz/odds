package org.odds.mvc.admin.orphanage;

/**
 *
 * @author kenkataiwa
 */
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.odds.hibernate.dao.OrphanageAddressDAO;
import org.odds.hibernate.dao.OrphanageContactDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;

import org.odds.mvc.admin.form.OrphanageValidator;
import org.odds.mvc.admin.form.OrphanageBean;
import org.odds.hibernate.entities.Orphanage;
import org.odds.hibernate.entities.OrphanageContact;
import org.odds.hibernate.entities.OrphanageAddress;
import org.odds.hibernate.dao.OrphanageDAO;
import org.odds.hibernate.dao.UserDAO;
import org.odds.hibernate.entities.User;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping("/admin/orphanage/create")
public class CreateController {

    OrphanageValidator orphanageValidator;

    @Autowired
    public CreateController(OrphanageValidator orphanageValidator) {
        this.orphanageValidator = orphanageValidator;
    }

    @ModelAttribute("regions")
    public Map<String, String> populateRegions() {
        Map<String, String> region = new LinkedHashMap<String, String>();
        region.put("Dar es Salaam", "Dar es Salaam");
        region.put("Dodoma", "Dodoma");
        region.put("Mwanza", "Mwanza");
        region.put("Arusha", "Arusha");
        region.put("Kilimanjaro", "Kilimanjaro");
        return region;
    }

    @ModelAttribute("users")
    public List<User> populateUsers() {
        List<User> users = UserDAO.listUser();
        return users;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String initForm(Model model) {

        OrphanageBean orphanage = new OrphanageBean();
        orphanage.setRegion("DSM");
        model.addAttribute("orphanage", orphanage);
        return "/admin/orphanage/create";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String processSubmit(
            @ModelAttribute("orphanage") OrphanageBean form,
            BindingResult result, SessionStatus status, Model model) {


        orphanageValidator.validate(form, result);

        if (result.hasErrors()) {
            //if validator failed
            return "/admin/orphanage/create";
        } else {
            status.setComplete();
            model.addAttribute("success", true);

            User user = UserDAO.getUser(form.getAdmin());

            Orphanage newOrphanage = new Orphanage();
            newOrphanage.setName(form.getName());
            newOrphanage.setDetails(form.getDetails());
            newOrphanage.getUsers().add(user);
            Orphanage orphanage = OrphanageDAO.createOrphanage(newOrphanage);

            // Todo:
            // Save address as well
            OrphanageAddress oa = new OrphanageAddress();
            oa.setOrphanage(orphanage);
            oa.setRegion(form.getRegion());
            oa.setLongitude(form.getLongitude());
            oa.setLatitude(form.getLatitude());
            OrphanageAddressDAO.create(oa);

            OrphanageContact oc = new OrphanageContact();
            oc.setEmail(form.getEmail());
            oc.setOrphanage(orphanage);
            OrphanageContactDAO.create(oc);

            //form success
            return "/admin/orphanage/create";
        }
    }
}
