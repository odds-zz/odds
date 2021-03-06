package org.odds.mvc.donations.form;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import org.odds.mvc.donations.form.DonationBean;

/**
 *
 * @author kenkataiwa
 */
public class DonationValidator implements Validator {

    @Override
    public boolean supports(Class supported) {
        //just validate the OrphanageBean instances
        return DonationBean.class.isAssignableFrom(supported);
    }

    @Override
    public void validate(Object target, Errors errors) {

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name",
                "required.name", "Field name is required.");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email",
                "required.email", "Field email is required.");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "phone",
                "required.phone", "Field phone is required.");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "details",
                "required.details", "Field details is required.");
    }
}
