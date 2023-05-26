package com.example.commerce.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.commerce.Request.UserRequest;
import com.example.commerce.dao.User;
import com.example.commerce.services.UserService;

@RestController
@RequestMapping("/api")
public class Authentication {

    @Autowired
    private UserService userService;


    //register user
    @PostMapping("/{register}")
    public ResponseEntity<?> createUser(@Valid @RequestBody UserRequest userRequest, BindingResult result) {
        if (result.hasErrors()) {
            return ResponseEntity.badRequest().body("Invalid user request");
        }
        User user = userService.createUser(userRequest.getEmail(),userRequest.getFirstname(),userRequest.getLastname(), userRequest.getAge(), userRequest.getPassword());
        return ResponseEntity.ok(user);
    }

    //log user in
    @PostMapping("/login")
    public String logInUser(@Valid @RequestBody UserRequest userRequest, BindingResult result) {
        // Logic for authenticating user and generating a session token
        return "User authenticated and session token generated";
    }

    @PostMapping("/logout")
    public String logoutUser() {
        // Logic for invalidating the user session token
        return "User session token invalidated";
    }
}