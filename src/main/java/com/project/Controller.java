package com.project;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Controller
public class Controller {

    @RequestMapping("/hello")
    public ModelAndView helloWorld() {
        String message = "SPRING MVC";
        return new ModelAndView("hellopage", "message", message);
    }

}
