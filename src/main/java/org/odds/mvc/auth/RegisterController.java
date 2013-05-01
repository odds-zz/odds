package org.odds.mvc.auth;

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

import org.odds.mvc.auth.validator.RegisterValidator;
import org.odds.mvc.auth.form.RegisterBean;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping("/auth/register")
public class RegisterController {

    RegisterValidator registerValidator;

    @Autowired
    public RegisterController(RegisterValidator registerValidator) {
        this.registerValidator = registerValidator;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String initForm(Model model) {

        RegisterBean user = new RegisterBean();

        model.addAttribute("user", user);

        return "auth/register";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String processSubmit(
            @ModelAttribute("user") RegisterBean user,
            BindingResult result, SessionStatus status) {


        registerValidator.validate(user, result);

        if (result.hasErrors()) {
            //if validator failed
            return "auth/register";
        } else {
            status.setComplete();
            //form success
            return "auth/register";
        }
    }
}
