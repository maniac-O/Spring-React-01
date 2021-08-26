package com.velog.maniac.NaverApi.controller;

import com.velog.maniac.NaverApi.controller.tmp.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@Service
public class UserApiController {

    @Autowired
    @PostMapping("/api/users")
    public User user() {
        System.out.println("UserApiController 진입");

        User user = new User(1, "조승현", "jo123", "1234");

        return user;
    }
}
/*
 * package com.apache.gradle.gradle.controller;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Controller; import
 * org.springframework.stereotype.Service; import
 * org.springframework.web.bind.annotation.PostMapping; import
 * org.springframework.web.bind.annotation.RestController; import
 * org.springframework.web.servlet.config.annotation.EnableWebMvc;
 * 
 * @EnableWebMvc
 * 
 * @Controller
 * 
 * @Service public class UserApiController {
 * 
 * @Autowired
 * 
 * @PostMapping("/api/users") public User user() {
 * System.out.println("UserApiController 진입");
 * 
 * User user = new User(1, "조승현", "jo123", "1234");
 * 
 * return user; } }
 */