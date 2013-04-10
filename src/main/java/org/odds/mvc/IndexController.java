/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.odds.mvc;

/**
 *
 * @author kenkataiwa
 */
import org.hibernate.Session;
import org.odds.hibernate.User;
import org.odds.hibernate.dao.UserDAO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Handles requests for the application home page.
 */
@Controller
public class IndexController {

    Session session = null;

    @RequestMapping(value = "/")
    public String home(Model model) {

//        UserDAO userDAO = new UserDAO();
//        User user = userDAO.getUser(1);
//        model.addAttribute("user", user);

        return "index";
    }

    @RequestMapping(value = "/about")
    public String about(Model model) {

        return "odds/about";
    }

    @RequestMapping(value = "/children")
    public String children(Model model) {

        return "odds/children";
    }

    @RequestMapping(value = "/help")
    public String help(Model model) {

        return "help/index";
    }

    @RequestMapping(value = "/government")
    public String odds(Model model) {

        return "odds/government";
    }

    @RequestMapping(value = "/partners")
    public String partners(Model model) {

        return "odds/partners";
    }

    @RequestMapping(value = "/more")
    public String more(Model model) {

        return "odds/more";
    }

}
