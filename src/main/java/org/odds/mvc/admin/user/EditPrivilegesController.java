/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.odds.mvc.admin.user;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.odds.hibernate.dao.UserDAO;
import org.odds.hibernate.entities.User;
import org.odds.mvc.admin.form.UserPrivilegesBean;
import org.odds.mvc.admin.form.UserPrivilegesValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;

/**
 *
 * @author kenkataiwa
 */
@Controller
@RequestMapping(value = {"/admin/user/edit/{id}"})
public class EditPrivilegesController {
    
    UserPrivilegesValidator validator;
    
    @Autowired
    public EditPrivilegesController(UserPrivilegesValidator validator) {
        this.validator = validator;
    }
    
    @ModelAttribute("userRoles")
    public List<String> populateRoles() {
        List<String> userRoles = new ArrayList<String>();
        userRoles.add("Authorized user");
        userRoles.add("System administrator");
        return userRoles;
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public String initForm(ModelMap model, @PathVariable("id") int id) {
        
        User user = UserDAO.getUser(id);
        UserPrivilegesBean form = new UserPrivilegesBean();
        form.setName(user.getFirstname() + " " + user.getLastname());
        form.setUserRoles(new String[]{"Authorized user", "System administrator"});
        model.put("user", form);
        return "/admin/users/edit";
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public String processSubmit(
            @ModelAttribute("user") UserPrivilegesBean form,
            BindingResult result, SessionStatus status, ModelMap model) {
        
        validator.validate(form, result);
        
        if (result.hasErrors()) {
            //if validator failed
            return "/admin/users/edit";
        } else {
            status.setComplete();
            model.addAttribute("success", true);
            return "/admin/users/edit";
        }
    }
}
