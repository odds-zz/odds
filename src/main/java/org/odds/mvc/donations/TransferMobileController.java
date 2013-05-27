package org.odds.mvc.donations;

/**
 *
 * @author kenkataiwa
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;

import org.odds.mvc.donations.form.DonationValidator;
import org.odds.mvc.donations.form.MobileTransferBean;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping("/donation/money/transfer/mobile")
public class TransferMobileController {

    DonationValidator donationValidator;

    @Autowired
    public TransferMobileController(DonationValidator donationValidator) {
        this.donationValidator = donationValidator;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String initForm(Model model) {

        MobileTransferBean donation = new MobileTransferBean();

        model.addAttribute("donation", donation);

        return "/donation/transfer/mobile";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String processSubmit(
            @ModelAttribute("donation") MobileTransferBean form,
            BindingResult result, SessionStatus status) {


        donationValidator.validate(form, result);

        if (result.hasErrors()) {
            //if validator failed
            return "/donation/transfer/mobile";
        } else {
            status.setComplete();

            //form success
            return "/donation/transfer/mobile";
        }
    }
}
