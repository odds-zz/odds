package org.odds.mvc.admin.form;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import org.odds.mvc.admin.form.OrphanageBean;

/**
 *
 * @author kenkataiwa
 */
public class OrphanageValidator implements Validator {

    @Override
    public boolean supports(Class supported) {
        //just validate the OrphanageBean instances
        return OrphanageBean.class.isAssignableFrom(supported);
    }

    @Override
    public void validate(Object target, Errors errors) {

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name",
                "required.name", "Field name is required.");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "details",
                "required.details", "Field name is required.");
    }
}
