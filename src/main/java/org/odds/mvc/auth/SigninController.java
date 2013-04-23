/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.odds.mvc.auth;

/**
 *
 * @author kenkataiwa
 */
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import org.odds.hibernate.entities.User;
import org.odds.hibernate.dao.UserDAO;
import org.odds.mvc.extensions.ajax.AjaxUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value = "/auth/signin")
public class SigninController {


    @RequestMapping(method = RequestMethod.GET)
    public void signin() {
    }

}
