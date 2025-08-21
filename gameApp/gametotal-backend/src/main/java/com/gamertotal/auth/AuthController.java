package com.gamertotal.auth;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @PostMapping("/login")
    public String login(@RequestParam String email, @RequestParam String password) {
        // Lógica de autenticación por email
        return "Login por email (mock)";
    }

    @GetMapping("/google")
    public String googleLogin() {
        // Lógica de autenticación Google (mock)
        return "Login por Google (mock)";
    }
}
