package com.instabot.ireesh.controllers;

import com.instabot.ireesh.entities.Status;
import com.instabot.ireesh.services.UserServiceImpl;
import netscape.security.ForbiddenTargetException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import java.security.Principal;

@Controller
public class MainController {
    @Autowired
    UserServiceImpl userService;

    @GetMapping("/")
    public String startPage() {
        return "login";
    }

    @GetMapping("/bot")
    public String homePage(HttpServletRequest request, Principal principal) throws Exception {
        if (userService.findUserByLogin(principal.getName()).getStatus().equals(Status.ACTIVE)) {
            return "index";
        } else {
            request.logout();
            return "login";
        }
    }

    @GetMapping("/users")
    public String usersAdministrate() {
        return "users";
    }
}
