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
public class StatisticsController {

    Session session = null;

    @RequestMapping(value = "/statistics")
    public String home(Model model) {

        return "statistics/index";
    }

    @RequestMapping(value = "/statistics/orphanages")
    public String help(Model model) {

        return "statistics/index";
    }



}
