package org.odds.mvc.donations.form;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import org.odds.mvc.donations.form.CreateCardTransferBean;

/**
 *
 * @author kenkataiwa
 */
public class CreateCardDonationValidator implements Validator {

    @Override
    public boolean supports(Class supported) {
        //just validate the OrphanageBean instances
        return CreateCardTransferBean.class.isAssignableFrom(supported);
    }

    @Override
    public void validate(Object target, Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "donor",
                "required.donor", "Field donor is required.");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email",
                "required.email", "Field email is required.");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "account",
                "required.account", "Field Car No. is required.");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "service",
                "required.service", "Field service is required.");
    }
}
