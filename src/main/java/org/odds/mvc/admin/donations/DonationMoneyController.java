package org.odds.mvc.admin.donations;

/**
 *
 * @author kenkataiwa
 */
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class DonationMoneyController {

    @RequestMapping(value = "/admin/donation/money/distribute")
    public String index(Model model) {

        return "/admin/orphanage/create";
    }
}
