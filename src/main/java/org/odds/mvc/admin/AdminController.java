/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.odds.mvc.admin;

/**
 *
 * @author kenkataiwa
 */
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Handles requests for the application home page.
 */
@Controller
public class AdminController {

    @RequestMapping(value = "/admin")
    public String home(Model model) {
        return "admin/index";
    }

    @RequestMapping(value = "/admin/donations")
    public String donations(Model model) {

        return "admin/donations";
    }

    @RequestMapping(value = "/admin/media")
    public String media(Model model) {

        return "admin/media";
    }

    @RequestMapping(value = "/admin/messaging")
    public String messaging(Model model) {

        return "admin/messaging";
    }

    @RequestMapping(value = "/admin/news")
    public String news(Model model) {

        return "admin/news";
    }

    @RequestMapping(value = "/admin/reports")
    public String reports(Model model) {

        return "admin/reports";
    }

    @RequestMapping(value = "/admin/statistics")
    public String statistics(Model model) {

        return "admin/statistics";
    }

    @RequestMapping(value = "/admin/users")
    public String user(Model model) {

        return "admin/users";
    }

    @RequestMapping(value = "/admin/orphanage")
    public String orphanage(Model model) {

        return "admin/orphanage";
    }

    @RequestMapping(value = "/admin/orphanages")
    public String orphanages(Model model) {

        return "admin/orphanages";
    }

    @RequestMapping(value = "/admin/orphanage/edit")
    public String orphanageEdit(Model model) {

        return "admin/orphanage/edit";
    }
    
}
