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
public class DonationController {

    @RequestMapping(value = "/donation")
    public String index(Model model) {

        return "donation/index";
    }

    @RequestMapping(value = "/donation/funds")
    public String funds(Model model) {

        return "donation/funds";
    }

    @RequestMapping(value = "/donation/food")
    public String food(Model model) {

        return "donation/food";
    }

    @RequestMapping(value = "/donation/money")
    public String money(Model model) {

        return "donation/money";
    }

    @RequestMapping(value = "/donation/scholarship")
    public String scholarship(Model model) {

        return "donation/scholarship";
    }

}
