package org.odds.mvc.admin.orphanage;

/**
 *
 * @author kenkataiwa
 */
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
import org.odds.hibernate.dao.OrphanageDAO;

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

    @RequestMapping(method = RequestMethod.GET)
    public String initForm(Model model) {

        OrphanageBean orphanage = new OrphanageBean();

        model.addAttribute("orphanage", orphanage);

        return "/admin/orphanage/create";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String processSubmit(
            @ModelAttribute("orphanage") OrphanageBean form,
            BindingResult result, SessionStatus status) {


        orphanageValidator.validate(form, result);

        if (result.hasErrors()) {
            //if validator failed
            return "/admin/orphanage/create";
        } else {
            status.setComplete();

            Orphanage newOrphanage = new Orphanage();
            newOrphanage.setName(form.getName());
            newOrphanage.setDetails(form.getDetails());
            Orphanage orphanage = OrphanageDAO.createOrphanage(newOrphanage);

            OrphanageContact oc = new OrphanageContact();
            oc.setEmail(form.getEmail());
            oc.setOrphanage(orphanage);
            OrphanageContactDAO.create(oc);

            //form success
            return "/admin/orphanage/create";
        }
    }
}
