package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Controller annotation will tell SpringBootWebApplication to include this class
 */
@Controller
public class DefaultController {

    /**
     * localhost:8080/
     * @return
     */
    @RequestMapping("/")
    public String home() { return "home"; }

    /**
     * localhost:8080/home
     * @return
     */
    @RequestMapping("/home")
    public String home1() { return "home"; }

    /**
     * localhost:8080/about
     * @return
     */
    @RequestMapping("/about")
    public String about() { return "about"; }

    /**
     * localhost:8080/hello
     * http://localhost:8080/hello?name=Marcus Chiu
     * http://localhost:8080/hello?name=Marcus%20Chiu
     * @param name
     * @param model
     * @return
     */
    @RequestMapping("/hello")
    public String getHello(@RequestParam(value="name", required = false, defaultValue = "Default Value") String name, Model model) {
        model.addAttribute("name", name);
        return "hello";
    }
}
