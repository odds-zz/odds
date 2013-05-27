package org.odds.mvc.donations;

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
public class TransferController {

    @RequestMapping("/donation/money/transfer/bank")
    public String index(Model model) {

        return "/donation/money/transfer/bank";
    }
}
