package org.odds.mvc.donations;

/**
 *
 * @author kenkataiwa
 */
import java.util.Date;
import org.odds.hibernate.dao.DonationMoneyDAO;
import org.odds.hibernate.entities.DonationMoney;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;

import org.odds.mvc.donations.form.CreateCardDonationValidator;
import org.odds.mvc.donations.form.CreateCardTransferBean;
import org.springframework.ui.ModelMap;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping("/donation/money/transfer/creditcard")
public class TransferCreditCardController {

    CreateCardDonationValidator donationValidator;

    @Autowired
    public TransferCreditCardController(CreateCardDonationValidator donationValidator) {
        this.donationValidator = donationValidator;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String initForm(Model model) {

        CreateCardTransferBean donation = new CreateCardTransferBean();

        model.addAttribute("donation", donation);

        return "/donation/transfer/creditcard";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String processSubmit(
            @ModelAttribute("donation") CreateCardTransferBean form,
            BindingResult result, SessionStatus status, ModelMap model) {


        donationValidator.validate(form, result);

        if (result.hasErrors()) {
            //if validator failed
            return "/donation/transfer/creditcard";
        } else {
            status.setComplete();
            model.addAttribute("success", true);  
            
            DonationMoney donation = new DonationMoney();
            donation.setAmount(form.getAmount());
            donation.setDonor(form.getDonor());
            donation.setDonorEmail(form.getEmail());
            donation.setMessage(form.getMessage());
            donation.setStatus("1");
            donation.setTime(new Date());
            donation.setUser(null);
            DonationMoneyDAO.createDonation(donation);

            //form success
            return "/donation/transfer/creditcard";
        }
    }
}
