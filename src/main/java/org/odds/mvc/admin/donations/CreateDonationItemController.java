package org.odds.mvc.admin.donations;

/**
 *
 * @author kenkataiwa
 */
import java.util.Date;
import org.odds.hibernate.dao.DonationItemDAO;
import org.odds.mvc.admin.form.DonationItemValidator;
import org.odds.mvc.admin.form.DonationItemBean;
import org.odds.hibernate.entities.User;
import org.odds.hibernate.entities.DonationItem;
import org.odds.hibernate.entities.OrphanageContact;
import org.odds.hibernate.entities.OrphanageAddress;
import org.odds.hibernate.dao.OrphanageDAO;
import org.odds.hibernate.dao.UserDAO;
import org.odds.hibernate.entities.DonationMoney;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value = "/admin/donation/item/register")
public class CreateDonationItemController {

    DonationItemValidator donationValidator;

    @Autowired
    public CreateDonationItemController(DonationItemValidator donationValidator) {
        this.donationValidator = donationValidator;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String initForm(Model model) {

        DonationItemBean donation = new DonationItemBean();
        model.addAttribute("donation", donation);

        return "/admin/donation/create-item";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String processSubmit(
            @ModelAttribute("donation") DonationItemBean form,
            BindingResult result, SessionStatus status, Model model) {


        donationValidator.validate(form, result);

        if (result.hasErrors()) {
            //if validator failed
            return "/admin/donation/create-item";
        } else {
            status.setComplete();
            model.addAttribute("success", true);

            DonationItem donation = new DonationItem();
            donation.setName(form.getName());
            donation.setDonor(form.getDonor());
            donation.setQuantity(form.getQuantity());
            donation.setMetric(form.getMetric());
            donation.setSize(form.getSize());
            donation.setStatus("1");
//            donation.setTime(new Date());
            donation.setUser(null);
            DonationItemDAO.createDonation(donation);
            
            //form success
            return "/admin/donation/create-item";
        }
    }
}
