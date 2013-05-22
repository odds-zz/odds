package org.odds.mvc.admin.orphanage;

/**
 *
 * @author kenkataiwa
 */
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.odds.hibernate.dao.OrphanageContactDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;

import org.odds.mvc.admin.form.OrphanageValidator;
import org.odds.mvc.admin.form.OrphanageBean;
import org.odds.hibernate.entities.Orphanage;
import org.odds.hibernate.entities.OrphanageContact;
import org.odds.hibernate.dao.OrphanageDAO;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping("/admin/orphanage/create")
public class CreateController {

    OrphanageValidator orphanageValidator;

    @Autowired
    public CreateController(OrphanageValidator orphanageValidator) {
        this.orphanageValidator = orphanageValidator;
    }

    /**
     *
     * @return @throws Exception
     */
    protected Map referenceData() throws Exception {

        Map referenceData = new HashMap();

        Map<String, String> country = new LinkedHashMap<String, String>();
        country.put("US", "United Stated");
        country.put("CHINA", "China");
        country.put("SG", "Singapore");
        country.put("MY", "Malaysia");
        referenceData.put("countryList", country);

        return referenceData;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String initForm(ModelMap model) {

        OrphanageBean orphanage = new OrphanageBean();
        Map<String, String> region = new LinkedHashMap<String, String>();
        region.put("DSM", "Dar es Salaam");
        region.put("DOM", "Dodoma");
        region.put("MWZ", "Mwanza");
        region.put("ARUSHA", "Arusha");
        model.put("regionList", region);
        model.put("orphanage", orphanage);

        return "/admin/orphanage/create";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String processSubmit(
            @ModelAttribute("orphanage") OrphanageBean form,
            BindingResult result, SessionStatus status, ModelMap model) {


        orphanageValidator.validate(form, result);

        if (result.hasErrors()) {
            //if validator failed
            return "/admin/orphanage/create";
        } else {
            status.setComplete();

            Orphanage newOrphanage = new Orphanage();
            newOrphanage.setName(form.getName());
            newOrphanage.setDetails(form.getDetails());
            Orphanage orphanage = OrphanageDAO.createOrphanage(newOrphanage);

            OrphanageContact oc = new OrphanageContact();
            oc.setEmail(form.getEmail());
            oc.setOrphanage(orphanage);
            OrphanageContactDAO.create(oc);

            //form success
            return "/admin/orphanage/create";
        }
    }
}
