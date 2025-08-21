package com.gamertotal.store;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/store")
public class StoreController {
    @GetMapping("/items")
    public String listItems() {
        // Lógica para listar artículos de la tienda (mock)
        return "Lista de artículos gaming";
    }

    @PostMapping("/cart")
    public String addToCart(@RequestParam Long itemId) {
        // Lógica para agregar al carrito (mock)
        return "Artículo " + itemId + " agregado al carrito";
    }
}
