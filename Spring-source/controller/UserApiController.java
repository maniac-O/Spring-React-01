package com.apache.gradle.gradle.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserApiController {

    @PostMapping("/api/users")
    public User user() {
        System.out.println("UserApiController 진입");

        User user = new User(1, "조승현", "jo123", "1234");

        return user;
    }
}
