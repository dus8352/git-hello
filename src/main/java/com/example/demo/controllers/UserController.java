package com.example.demo.controllers;

import java.util.HashMap;
import java.util.Map;

import com.example.demo.domains.UserDto;
import com.example.demo.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/users")
    public Map<String, String> join(@RequestBody UserDto user) {
        Map<String, String> map = new HashMap<>();
        System.out.println("join 들어옴");
        int result = userService.join(user);
        System.out.println("result값은 " + result);
        if (result == 1) {
            map.put("name", user.getName());
        } else {
            map.put("name", "FAILURE");
        }
        return map;
    }

    @PostMapping("/users/login")
    public Map<String, String> login(@RequestBody UserDto user) {
        Map<String, String> map = new HashMap<>();
        System.out.println("서버들어옴");
        UserDto result = userService.login(user);
        if (result != null) {
            map.put("name", result.getName());
        } else {
            map.put("name", "FAILURE");
        }
        return map;
    }
}
