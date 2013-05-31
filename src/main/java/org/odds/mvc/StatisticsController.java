/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.odds.mvc;

/**
 *
 * @author kenkataiwa
 */
import org.odds.hibernate.dao.OrphanageDAO;
import org.odds.hibernate.dao.ChildrenDAO;
import org.odds.hibernate.dao.DonationItemDAO;
import org.odds.hibernate.dao.DonationMoneyDAO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Handles requests for the application home page.
 */
@Controller
public class StatisticsController {

    @RequestMapping(value = "/statistics")
    public String index(Model model) {

        Integer numberOrphanages = OrphanageDAO.countOrphanages();
        Integer numberChildren = ChildrenDAO.countChildren();
        Integer numberMoneyDonations = DonationMoneyDAO.countDonations();
        Integer numberItemDonations = DonationItemDAO.countDonations();
        model.addAttribute("numberOrphanages", numberOrphanages);
        model.addAttribute("numberChildren", numberChildren);
        model.addAttribute("numberDonations", numberMoneyDonations + numberItemDonations);
        model.addAttribute("numberYearDonations", numberMoneyDonations + numberItemDonations);
        return "statistics/index";
    }

    @RequestMapping(value = "/statistics/orphanages")
    public String orphanages(Model model) {

        Integer numberOrphanages = OrphanageDAO.countOrphanages();
        Integer numberChildren = ChildrenDAO.countChildren();
        model.addAttribute("numberOrphanages", numberOrphanages);
        model.addAttribute("numberChildren", numberChildren);
        model.addAttribute("numberMonthOrphanages", numberOrphanages);
        model.addAttribute("numberYearOrphanages", numberChildren);
        return "statistics/orphanages";
    }

    @RequestMapping(value = "/statistics/donations")
    public String donations(Model model) {

        Integer numberMoneyDonations = DonationMoneyDAO.countDonations();
        Integer numberItemDonations = DonationItemDAO.countDonations();
        model.addAttribute("numberDonations", numberMoneyDonations + numberItemDonations);
        model.addAttribute("numberYearDonations", numberMoneyDonations + numberItemDonations);
        model.addAttribute("numberMoneyDonations", numberMoneyDonations);
        model.addAttribute("numberItemDonations", numberItemDonations);
        return "statistics/donations";
    }

    @RequestMapping(value = "/statistics/children")
    public String children(Model model) {

        Integer numberOrphanages = OrphanageDAO.countOrphanages();
        Integer numberChildren = ChildrenDAO.countChildren();
        model.addAttribute("numberOrphanages", numberOrphanages);
        model.addAttribute("numberChildren", numberChildren);
        return "statistics/children";
    }
}
