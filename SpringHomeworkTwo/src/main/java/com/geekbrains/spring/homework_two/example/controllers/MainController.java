package com.geekbrains.spring.homework_two.example.controllers;

import org.springframework.web.bind.annotation.GetMapping;

public class MainController {
    @GetMapping("/")
    public String greeting() {
        return "index";
    }

}
