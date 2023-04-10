package com.api.twiteroo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.api.twiteroo.DTOs.PostTweetDTO;
import com.api.twiteroo.models.Tweet;
import com.api.twiteroo.services.TweetService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/tweets")
public class TweetController {

    @Autowired
    private TweetService service;

    @PostMapping
    public String create(@RequestBody @Valid PostTweetDTO body) {
        service.create(body);
        return "OK";
    }

    // @GetMapping
    // public List<Tweet> findAll(@RequestParam(defaultValue = "0") int page) {
    //     return service.findAll(page);
    // }

    // @GetMapping("/{username}")
    // public List<Tweet> find(@PathVariable String username) {
    //     return service.findByUser(username);
    // }
}