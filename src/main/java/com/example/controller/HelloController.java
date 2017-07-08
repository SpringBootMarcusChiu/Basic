package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by marcus.chiu on 10/1/16.
 */
@Controller
public class HelloController {

    @RequestMapping("/")
    public String home() {
        return "home";
    }

    @RequestMapping("/hello")
    public String getHello(@RequestParam(value="name", required = false, defaultValue = "Default Value") String param, Model model) {
        model.addAttribute("param", param);
        return "hello";
    }
}
