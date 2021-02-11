package com.instabot.ireesh.controllers;

import com.instabot.ireesh.services.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AuthenticationController {
    @Autowired
    UserServiceImpl userService;

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    @PostMapping("/auth")
    public String authPage() {
        return "redirect:/bot";
    }

    @PostMapping("/login")
    public String singUpNewUser(@Validated String username, String password) {
        if (userService.createNewUser(username, password)) {
            return "redirect:/login";
        } else {
            return "redirect:/error";
        }
    }
}
