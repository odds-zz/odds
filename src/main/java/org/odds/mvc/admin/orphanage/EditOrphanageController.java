package org.odds.mvc.admin.orphanage;

/**
 *
 * @author kenkataiwa
 */
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.odds.hibernate.dao.OrphanageContactDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;

import org.odds.mvc.admin.form.OrphanageValidator;
import org.odds.mvc.admin.form.OrphanageBean;
import org.odds.hibernate.entities.Orphanage;
import org.odds.hibernate.entities.OrphanageContact;
import org.odds.hibernate.dao.OrphanageDAO;
import org.odds.hibernate.dao.UserDAO;
import org.odds.hibernate.entities.User;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value = "/admin/orphanage/edit/{id}")
public class EditOrphanageController {

    OrphanageValidator orphanageValidator;

    @Autowired
    public EditOrphanageController(OrphanageValidator orphanageValidator) {
        this.orphanageValidator = orphanageValidator;
    }

    @ModelAttribute("regions")
    public Map<String, String> populateRegions() {
        Map<String, String> region = new LinkedHashMap<String, String>();
        region.put("Dar es Salaam", "Dar es Salaam");
        region.put("Dodoma", "Dodoma");
        region.put("Mwanza", "Mwanza");
        region.put("Arusha", "Arusha");
        return region;
    }

    @ModelAttribute("users")
    public List<User> populateUsers() {
        List<User> users = UserDAO.listUser();
        return users;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String initForm(ModelMap model, @PathVariable("id") int id) {
        Orphanage orphanage = OrphanageDAO.getOrphanage(id);
        OrphanageBean form = new OrphanageBean();
        form.setName(orphanage.getName());
        form.setDetails(orphanage.getDetails());
        form.setRegion("DSM");
        model.put("orphanage", form);
        return "/admin/orphanage/edit";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String processSubmit(
            @ModelAttribute("orphanage") OrphanageBean form,
            BindingResult result, SessionStatus status, ModelMap model) {


        orphanageValidator.validate(form, result);

        if (result.hasErrors()) {
            //if validator failed
            return "/admin/orphanage/edit";
        } else {
            status.setComplete();

//            User user = UserDAO.getUser(form.getAdmin());
//
//            Orphanage newOrphanage = new Orphanage();
//            newOrphanage.setName(form.getName());
//            newOrphanage.setDetails(form.getDetails());
//            newOrphanage.getUsers().add(user);
//            Orphanage orphanage = OrphanageDAO.createOrphanage(newOrphanage);
//
//            // Todo:
//            // Save address as well
//            // OrphanageAddress oa = new OrphanageAddress();
//
//            OrphanageContact oc = new OrphanageContact();
//            oc.setEmail(form.getEmail());
//            oc.setOrphanage(orphanage);
//            OrphanageContactDAO. create(oc);

            //form success
            return "redirect:/admin/orphanage/edit/1";
        }
    }
}
