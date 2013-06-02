package org.odds.mvc.admin.form;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import org.odds.mvc.admin.form.DonationItemBean;

/**
 *
 * @author kenkataiwa
 */
public class DonationItemValidator implements Validator {

    @Override
    public boolean supports(Class supported) {
        //just validate the OrphanageBean instances
        return DonationItemBean.class.isAssignableFrom(supported);
    }

    @Override
    public void validate(Object target, Errors errors) {

        DonationItemBean o = (DonationItemBean) target;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name",
                "required.name", "Field name is required.");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "donor",
                "required.donor", "Field donor is required.");
        if (o.getOrphanage() == null) {
            errors.rejectValue("orphanage", "required.orphanage", "Field orphanage is required.");
        }
    }
}
