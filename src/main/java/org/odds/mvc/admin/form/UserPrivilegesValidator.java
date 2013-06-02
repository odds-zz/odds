package org.odds.mvc.admin.form;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import org.odds.mvc.admin.form.UserPrivilegesBean;

/**
 *
 * @author kenkataiwa
 */
public class UserPrivilegesValidator implements Validator {

    @Override
    public boolean supports(Class supported) {
        //just validate the OrphanageBean instances
        return UserPrivilegesBean.class.isAssignableFrom(supported);
    }

    @Override
    public void validate(Object target, Errors errors) {

        UserPrivilegesBean user = (UserPrivilegesBean) target;
        if (user.getUserRoles().length == 0) {
            errors.rejectValue("userRoles", "required.userRoles", "Field name is required.");
        }

    }
}
