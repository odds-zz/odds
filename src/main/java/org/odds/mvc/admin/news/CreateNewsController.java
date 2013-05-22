package org.odds.mvc.admin.news;

/**
 *
 * @author kenkataiwa
 */
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping("/admin/news/create")
public class CreateNewsController {

    @RequestMapping(method = RequestMethod.GET)
    public String initForm(Model model) {

        return "/admin/news/create";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String processSubmit(
            BindingResult result, SessionStatus status, Model model) {


        if (result.hasErrors()) {
            //if validator failed
            return "/admin/news/create";
        } else {
            status.setComplete();
            //form success
            return "/admin/news/create";
        }
    }
}
