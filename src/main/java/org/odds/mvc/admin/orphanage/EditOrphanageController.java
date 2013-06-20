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
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;

import org.odds.mvc.admin.form.OrphanageValidator;
import org.odds.mvc.admin.form.OrphanageBean;
import org.odds.hibernate.entities.Orphanage;
import org.odds.hibernate.entities.OrphanageAddress;
import org.odds.hibernate.entities.OrphanageContact;
import org.odds.hibernate.dao.OrphanageDAO;
import org.odds.hibernate.dao.UserDAO;
import org.odds.hibernate.entities.User;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value = {"/admin/orphanage/edit/{id}", "/orphanage/edit/{id}"})
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
        OrphanageAddress address = OrphanageAddressDAO.getByOrphanage(orphanage.getId());
        OrphanageContact contact = OrphanageContactDAO.getByOrphanage(orphanage.getId());
        OrphanageBean form = new OrphanageBean();
        User u = OrphanageDAO.getAdmin(orphanage.getId());
        form.setName(orphanage.getName());
        form.setDetails(orphanage.getDetails());
        form.setRegion(address.getRegion());
        form.setEmail(contact.getEmail());
        form.setPhone(contact.getPhone());
        form.setAdmin(u.getId());
        model.put("orphanage", form);
        return "/admin/orphanage/edit";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String processSubmit(
            @ModelAttribute("orphanage") OrphanageBean form,
            BindingResult result, SessionStatus status, ModelMap model, @PathVariable("id") int id) {


        orphanageValidator.validate(form, result);

        if (result.hasErrors()) {
            //if validator failed
            return "/admin/orphanage/edit";
        } else {
            status.setComplete();
            model.addAttribute("success", true);

            User user = UserDAO.getUser(form.getAdmin());

            Orphanage orphanage = OrphanageDAO.getOrphanage(id);
            OrphanageAddress address = OrphanageAddressDAO.getByOrphanage(orphanage.getId());
            OrphanageContact contact = OrphanageContactDAO.getByOrphanage(orphanage.getId());

            orphanage.setName(form.getName());
            orphanage.setDetails(form.getDetails());
            contact.setEmail(form.getEmail());
            contact.setPhone(form.getPhone());
            address.setRegion(form.getRegion());

            OrphanageDAO.updateOrphanage(orphanage);
            OrphanageAddressDAO.update(address);
            OrphanageContactDAO.update(contact);

            //form success
            return "/admin/orphanage/edit";
        }
    }
}
