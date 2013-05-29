package org.odds.mvc.admin.form;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import org.odds.mvc.admin.form.PostNewsBean;

/**
 *
 * @author kenkataiwa
 */
public class NewsValidator implements Validator {

    @Override
    public boolean supports(Class supported) {
        //just validate the PostNewsBean instances
        return PostNewsBean.class.isAssignableFrom(supported);
    }

    @Override
    public void validate(Object target, Errors errors) {

        PostNewsBean o = (PostNewsBean) target;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "title",
                "required.title", "Field title is required.");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "body",
                "required.body", "Field body is required.");
    }
}
