package com.jwt.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/protected")
public class ProtectedController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from protected endpoint!";
    }

    @GetMapping("/admin")
    public String adminOnly() {
        return "Admin endpoint!";
    }

    @GetMapping("/user")
    public String userOnly() {
        return "User endpoint!";
    }
}