/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.odds.mvc.admin;

/**
 *
 * @author kenkataiwa
 */
import java.util.List;
import org.odds.hibernate.dao.OrphanageDAO;
import org.odds.hibernate.dao.UserDAO;
import org.odds.hibernate.entities.User;
import org.odds.hibernate.entities.Orphanage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
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

        List<User> uList;
        uList = UserDAO.listUser();
        model.addAttribute("users", uList);
        return "admin/users";
    }

    @RequestMapping(value = "/admin/orphanages")
    public String orphanages(Model model) {

        List<Orphanage> oList = OrphanageDAO.listOrphanages();
        model.addAttribute("orphanages", oList);

        return "admin/orphanages";
    }

    @RequestMapping(value = "/admin/orphanage/delete/{id}")
    public String orphanageDelete(Model model, @PathVariable("id") int id) {
        Orphanage o = OrphanageDAO.getOrphanage(id);
        // Check if the Orphanage exists, then delete
        OrphanageDAO.deleteOrphanage(o);
        // Todo:
        // Else say that orphanage does not exists.
        model.addAttribute("orphanage", o);
        return "redirect:/admin/orphanages";
    }
}
