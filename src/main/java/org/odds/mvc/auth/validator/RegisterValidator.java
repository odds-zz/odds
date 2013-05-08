package org.odds.mvc.auth.validator;

import org.odds.mvc.auth.form.RegisterBean;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 *
 * @author kenkataiwa
 */
public class RegisterValidator implements Validator {

    @Override
    public boolean supports(Class supported) {
        //just validate the OrphanageBean instances
        return RegisterBean.class.isAssignableFrom(supported);
    }

    @Override
    public void validate(Object target, Errors errors) {

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "firstname",
                "required.firstname", "Field name is required.");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "lastname",
                "required.lastname", "Field name is required.");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username",
                "required.username", "Field name is required.");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email",
                "required.email", "Field name is required.");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password",
                "required.password", "Field name is required.");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "confirmPassword",
                "required.confirmPassword", "Field name is required.");

        RegisterBean form = (RegisterBean) target;

        if (!(form.getPassword().equals(form.getConfirmPassword()))) {
            System.out.println("Checking password equality");
            errors.rejectValue("password", "notmatch.password", "Passwords didn't match");
            errors.rejectValue("confirmPassword", "notmatch.password", "Passwords didn't match");
        }

        // Check if username exists
    }
}