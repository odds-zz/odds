package org.odds.mvc.admin.form;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import org.odds.mvc.admin.form.OrphanageChildBean;

/**
 *
 * @author kenkataiwa
 */
public class OrphanageChildValidator implements Validator {

    @Override
    public boolean supports(Class supported) {
        //just validate the OrphanageBean instances
        return OrphanageChildBean.class.isAssignableFrom(supported);
    }

    @Override
    public void validate(Object target, Errors errors) {

        OrphanageChildBean child = (OrphanageChildBean) target;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name",
                "required.name", "Field name is required.");
    }
}
