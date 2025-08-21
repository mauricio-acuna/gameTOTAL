package com.gamertotal.user;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @GetMapping("/{id}")
    public String getUser(@PathVariable Long id) {
        // Lógica para obtener usuario por id (mock)
        return "Usuario " + id;
    }

    @PostMapping("/")
    public String createUser(@RequestParam String email, @RequestParam String name) {
        // Lógica para crear usuario (mock)
        return "Usuario creado: " + name;
    }
}
