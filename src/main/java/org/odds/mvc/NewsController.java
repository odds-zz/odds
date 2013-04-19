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
public class NewsController {

    Session session = null;

    @RequestMapping(value = "/news")
    public String index(Model model) {

        return "news/index";
    }

    @RequestMapping(value = "/news/orphanages")
    public String orphanages(Model model) {

        return "news/orphanages";
    }

}
