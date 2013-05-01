/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.odds.mvc.auth;

/**
 *
 * @author kenkataiwa
 */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


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
