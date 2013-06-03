/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.odds.mvc.admin.orphanage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.odds.hibernate.dao.OrphanageDAO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.odds.hibernate.entities.Orphanage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

@Controller
@RequestMapping("/admin/orphanages/pdf/")
public class OrphanageReportController {

    @RequestMapping(value = "/html", produces = "application/xml")
    public String html(Model model) {

        return "admin/test";
    }

    @RequestMapping("/simple")
    public ModelAndView beanToPdfSimple() {
        ModelAndView m = new ModelAndView("simpleOrphanagesPdfView");
//        student.setName("Braxton Miller");
//        m.getModelMap().addAttribute("stud", student);
        return m;
    }

    @RequestMapping("/rich")
    public ModelAndView beanToPdf() {
        ModelAndView m = new ModelAndView("richOrphanagesPdfView");
        return m;
    }
}