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

import org.odds.hibernate.HibernateUtil;
import org.odds.hibernate.entities.User;
import org.hibernate.Session;

/**
 * Handles requests for the application home page.
 */
@Controller
public class OrphanageController {

    Session session = null;

    @RequestMapping(value = "/orphanage")
    public String index(Model model) {

        return "orphanage/index";
    }

    @RequestMapping(value = "/orphanage/admin")
    public String admin(Model model) {

        return "orphanage/admin";
    }

    @RequestMapping(value = "/orphanage/records")
    public String records(Model model) {

        return "orphanage/records";
    }

    @RequestMapping(value = "/orphanage/children")
    public String children(Model model) {

        return "orphanage/children";
    }


}
