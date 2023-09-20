package com.wizard.bwbackend.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class WelcomeController {
    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public String signUpFranchiseeAndStaff() {
        return "hello world";
    }
}
