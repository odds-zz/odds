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

/**
 * Handles requests for the application home page.
 */
@Controller
public class AdminController {

    @RequestMapping(value = "/admin")
    public String home(Model model) {
        return "admin/index";
    }

    @RequestMapping(value = "/admin/orphanage")
    public String orphanage(Model model) {

        return "admin/orphanage";
    }

    @RequestMapping(value = "/admin/orphanages")
    public String orphanages(Model model) {

        return "admin/orphanages";
    }


}
