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
public class AdminUsersController {

    @RequestMapping(value = "/admin/users")
    public String user(Model model) {

        List<User> uList;
        uList = UserDAO.listUser();
        model.addAttribute("users", uList);
        return "admin/users/all";
    }

    @RequestMapping(value = "/admin/users/systemadmins")
    public String systemAdmins(Model model) {

        List<User> uList;
        uList = UserDAO.listSystemAdministrators();
        model.addAttribute("users", uList);
        return "admin/users/system-admins";
    }

    @RequestMapping(value = "/admin/users/orphanageadmins")
    public String orphanageAdmins(Model model) {

        List<User> uList;
        uList = UserDAO.listOrphanageAdministrators();
        model.addAttribute("users", uList);
        return "admin/users/orphanage-admins";
    }
}
