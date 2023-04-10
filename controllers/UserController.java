package com.api.twiteroo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.twiteroo.DTOs.UserDTO;
import com.api.twiteroo.services.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping()
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/sign-up")
    public String Create(@RequestBody @Valid UserDTO req) {
        service.create(req);
        return "OK";
    }

}
