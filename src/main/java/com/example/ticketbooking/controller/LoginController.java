package com.example.ticketbooking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @GetMapping("/")
    public String login() {
        return "login";
    }

    @PostMapping("/login")
    public String loginUser(@RequestParam String username, @RequestParam String password, HttpSession session) {
        // Here using the Simple authentication logic using hardcoded credentials
        if (isValidUser(username, password)) {
            session.setAttribute("username", username);
            return "redirect:/movies"; 
        } else {
            return "login"; 
        }
    }

    private boolean isValidUser(String username, String password) {
        // Hardcoded credentials
        Map<String, String> users = new HashMap<>();
        users.put("user1", "password");
        users.put("user2", "password");
        users.put("user3", "password");
        users.put("user4", "password");
        users.put("user5", "password");
        
        // Checking if the provided username and password match any of the hardcoded credentials
        return users.containsKey(username) && users.get(username).equals(password);
    }
}
