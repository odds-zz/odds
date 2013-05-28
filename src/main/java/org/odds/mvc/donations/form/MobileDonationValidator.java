package org.odds.mvc.donations.form;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import org.odds.mvc.donations.form.MobileTransferBean;

/**
 *
 * @author kenkataiwa
 */
public class MobileDonationValidator implements Validator {

    @Override
    public boolean supports(Class supported) {
        //just validate the OrphanageBean instances
        return MobileTransferBean.class.isAssignableFrom(supported);
    }

    @Override
    public void validate(Object target, Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "donor",
                "required.donor", "Field donor is required.");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email",
                "required.email", "Field email is required.");
    }
}
