package com.session.redis.controllers;

import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class HomeController {

    @GetMapping("/")
    public String homePage(Principal principal, HttpSession httpSession) {
        return principal.getName() + " - " + httpSession.getId();
    }
}
