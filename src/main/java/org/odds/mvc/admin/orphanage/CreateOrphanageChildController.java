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

import org.odds.mvc.admin.form.OrphanageChildValidator;
import org.odds.mvc.admin.form.OrphanageChildBean;
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
@RequestMapping(value = "/admin/orphanage/child/{id}")
public class CreateOrphanageChildController {

    OrphanageChildValidator childValidator;

    @Autowired
    public CreateOrphanageChildController(OrphanageChildValidator childValidator) {
        this.childValidator = childValidator;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String initForm(ModelMap model, @PathVariable("id") int id) {
        OrphanageChildBean form = new OrphanageChildBean();
        model.put("child", form);
        return "/admin/orphanage/create-child";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String processSubmit(
            @ModelAttribute("child") OrphanageChildBean form,
            BindingResult result, SessionStatus status, ModelMap model) {


        childValidator.validate(form, result);

        if (result.hasErrors()) {
            //if validator failed
            return "/admin/orphanage/create-child";
        } else {
            status.setComplete();
            model.addAttribute("success", true);


            //form success
            return "/admin/orphanage/create-child";
        }
    }
}
