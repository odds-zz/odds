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

        OrphanageBean o = (OrphanageBean) target;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name",
                "required.name", "Field name is required.");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email",
                "required.email", "Field email is required.");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "phone",
                "required.phone", "Field phone is required.");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "details",
                "required.details", "Field details is required.");
        if (o.getRegion().isEmpty()) {
            errors.rejectValue("region", "required.region", "Field region is required.");
        }
        if (o.getAdmin() == null) {
            errors.rejectValue("admin", "required.admin", "Field administrator is required.");
        }
    }
}
