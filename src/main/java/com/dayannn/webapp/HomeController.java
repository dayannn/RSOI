package com.dayannn.webapp; /**
 * Created by dayan on 12.09.2018.
 */

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class HomeController {
    @RequestMapping(value = "/")
    public String home(@RequestParam(value = "username", required = false, defaultValue = "USER") String username, ModelMap model){
        model.put("username", username);
        return "index";
    }

}
