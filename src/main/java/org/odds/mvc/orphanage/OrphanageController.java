/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.odds.mvc.orphanage;

/**
 *
 * @author kenkataiwa
 */
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.odds.hibernate.dao.OrphanageDAO;
import org.odds.hibernate.entities.Orphanage;

/**
 * Handles requests for the application home page.
 */
@Controller
public class OrphanageController {

    @RequestMapping(value = "/orphanage")
    public String index(Model model) {

        return "orphanage/index";
    }

    @RequestMapping(value = "/orphanage/list")
    public String list(Model model) {

        List<Orphanage> oList = OrphanageDAO.listOrphanages();
        model.addAttribute("orphanages", oList);

        return "orphanage/list";
    }

    @RequestMapping(value = "/orphanage/view/{id}")
    public String view(Model model, @PathVariable("id") int id) {

        Orphanage o = OrphanageDAO.getOrphanage(id);
        model.addAttribute("orphanage", o);
        return "orphanage/view";
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
