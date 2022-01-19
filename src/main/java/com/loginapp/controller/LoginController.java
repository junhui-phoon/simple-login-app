package com.loginapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping({"/", "/login"})
    public String login() {
        return "login";
    }


    @GetMapping("/manager")
    public String manager() {
        return "manager";
    }

    @GetMapping("/welcome")
    public String welcomePage() {
        return "welcome";
    }
}
