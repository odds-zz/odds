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
import org.odds.hibernate.dao.UserDAO;
import org.odds.hibernate.entities.User;
import org.odds.hibernate.entities.UserContact;
import org.odds.hibernate.entities.UserRole;

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
            @ModelAttribute("user") RegisterBean form,
            BindingResult result, SessionStatus status) {


        registerValidator.validate(form, result);

        if (result.hasErrors()) {
            //if validator failed
            System.out.println(form.getFirstname() + " " + form.getLastname());
            return "auth/register";
        } else {
            status.setComplete();

            User newUser = new User();
            UserContact contact = new UserContact();
            UserRole role = new UserRole();

            contact.setEmail(form.getEmail());
            contact.setUser(newUser);
            role.setAuthority("ROLE_USER");
            newUser.setFirstname(form.getFirstname());
            newUser.setLastname(form.getLastname());
            newUser.setUsername(form.getUsername());
            newUser.setPassword(form.getPassword());

//            newUser.setUserContacts(contact);
            //form success
            UserDAO.createUser(newUser);
            return "redirect:/auth/signin";
        }
    }
}
