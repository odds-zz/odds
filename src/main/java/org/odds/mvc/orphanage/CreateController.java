package org.odds.mvc.orphanage;

/**
 *
 * @author kenkataiwa
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;

import org.odds.mvc.orphanage.validator.OrphanageValidator;
import org.odds.mvc.orphanage.form.OrphanageBean;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping("/orphanage/create")
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

        return "orphanage/create";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String processSubmit(
            @ModelAttribute("orphanage") OrphanageBean orphanage,
            BindingResult result, SessionStatus status) {


        orphanageValidator.validate(orphanage, result);

        if (result.hasErrors()) {
            //if validator failed
            return "orphanage/create";
        } else {
            status.setComplete();
            //form success
            return "orphanage/create";
        }
    }
}
