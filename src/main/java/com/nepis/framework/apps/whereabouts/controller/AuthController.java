package com.nepis.framework.apps.whereabouts.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("auth-rest")
public class AuthController {

    @GetMapping(value = "/{id}", produces = "application/json")
    public String getAuthData(@PathVariable String id) {
        return String.format("Welcome : %s", id);
    }
}
