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
import org.odds.hibernate.dao.UserContactDAO;
import org.odds.hibernate.dao.UserRoleDAO;
import org.odds.hibernate.entities.User;
import org.odds.hibernate.entities.UserContact;
import org.odds.hibernate.entities.UserRole;
import java.security.MessageDigest;

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

            String hashPassword;
            try {
                hashPassword = this.hash(form.getPassword());
            } catch (Exception e) {
                return "auth/register";
            }

            // Save user
            User newUser = new User();
            newUser.setFirstname(form.getFirstname());
            newUser.setLastname(form.getLastname());
            newUser.setUsername(form.getUsername());
            newUser.setPassword(hashPassword);
            User user = UserDAO.createUser(newUser);

            // Save contact
            UserContact userContact = new UserContact();
            userContact.setEmail(form.getEmail());
            userContact.setUser(user);
            UserContactDAO.create(userContact);

            UserRole userRole = new UserRole();
            userRole.setAuthority("ROLE_USER");
            userRole.setUser(user);
            UserRoleDAO.create(userRole);

            //form success
            return "redirect:/auth/signin";
        }
    }

    public String hash(String phrase) throws Exception {

        String original = phrase;
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(original.getBytes());
        byte[] digest = md.digest();
        StringBuffer sb = new StringBuffer();
        for (byte b : digest) {
            sb.append(Integer.toHexString((int) (b & 0xff)));
        }

        return sb.toString();

    }
}
