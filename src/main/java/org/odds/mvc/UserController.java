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

import org.hibernate.Session;
import org.odds.hibernate.dao.UserDAO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class UserController {

    Session session = null;

    @RequestMapping(value = "/user/account")
    public String account(Model model) {

        User currentUser = (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        UserDAO userDAO = new UserDAO();
        org.odds.hibernate.entities.User user = userDAO.getUserByUsername( currentUser.getUsername() );

        model.addAttribute("user", user);

        return "user/account";
    }

    @RequestMapping(value = "/user/history")
    public String history(Model model) {

        User currentUser = (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        UserDAO userDAO = new UserDAO();
        org.odds.hibernate.entities.User user = userDAO.getUserByUsername( currentUser.getUsername() );

        model.addAttribute("user", user);

        return "user/history";
    }

}
