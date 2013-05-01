/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.odds.mvc;

/**
 *
 * @author kenkataiwa
 */
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.odds.hibernate.dao.UserDAO;
import org.odds.hibernate.dao.UserContactDAO;
import org.odds.hibernate.entities.UserContact;

/**
 * Handles requests for the application home page.
 */
@Controller
public class UserController {

    @RequestMapping(value = "/user/account")
    public String account(Model model) {

        User currentUser = (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        org.odds.hibernate.entities.User user = UserDAO.getUserByUsername( currentUser.getUsername() );

        UserContact uc = UserContactDAO.getByUser(user.getId());

        model.addAttribute("user", user);
        model.addAttribute("contact", uc );

        return "user/account";
    }

    @RequestMapping(value = "/user/history")
    public String history(Model model) {

        User currentUser = (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        org.odds.hibernate.entities.User user = UserDAO.getUserByUsername( currentUser.getUsername() );

        UserContact uc = UserContactDAO.getByUser(user.getId());

        model.addAttribute("user", user);
        model.addAttribute("contact", uc );

        return "user/history";
    }

}
