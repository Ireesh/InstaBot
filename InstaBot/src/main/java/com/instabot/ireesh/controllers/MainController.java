package com.instabot.ireesh.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String startPage() {
        return "login";
    }

    @GetMapping("/bot")
    public String homePage() {
        return "index";
    }

    @GetMapping("/users")
    public String usersAdministrate() {
        return "users";
    }
}
