package org.odds.mvc.donations;

/**
 *
 * @author kenkataiwa
 */
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;

import org.odds.mvc.donations.form.MobileDonationValidator;
import org.odds.mvc.donations.form.MobileTransferBean;
import org.odds.hibernate.entities.DonationMoney;
import org.odds.hibernate.dao.DonationMoneyDAO;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping("/donation/money/transfer/mobile")
public class TransferMobileController {

    MobileDonationValidator donationValidator;

    @Autowired
    public TransferMobileController(MobileDonationValidator donationValidator) {
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

            DonationMoney donation = new DonationMoney();
            donation.setAmount(form.getAmount());
            donation.setDonor(form.getDonor());
            donation.setMessage(form.getMessage());
            donation.setStatus("1");
            donation.setTime(new Date());
            donation.setUser(null);
            DonationMoneyDAO.createDonation(donation);
            //form success
            return "/donation/transfer/mobile";
        }
    }
}
