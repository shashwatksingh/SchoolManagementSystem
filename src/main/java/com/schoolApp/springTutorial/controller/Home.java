package com.schoolApp.springTutorial.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {
    @GetMapping(path = "/")
    public String Main() {
        return "Hello World from the School Management System!";
    }
}
