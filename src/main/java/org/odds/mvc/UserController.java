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

import org.hibernate.Session;

/**
 * Handles requests for the application home page.
 */
@Controller
public class UserController {

    Session session = null;

    @RequestMapping(value = "/user/account")
    public String account(Model model) {

        return "user/account";
    }

    @RequestMapping(value = "/user/history")
    public String history(Model model) {

        return "user/history";
    }

}
