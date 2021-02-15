package com.instabot.ireesh.controllers;

import com.instabot.ireesh.services.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

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
    public String singUpNewUser(Model model, @Validated HttpServletRequest request, String username, String password) throws ServletException {
        if (userService.createNewUser(username, password)) {
            request.login(username, password);
            return "bot";
        } else {
            return "login";
        }
    }
}
