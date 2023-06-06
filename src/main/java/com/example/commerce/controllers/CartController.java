package com.example.commerce.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.commerce.dao.Cart;
import com.example.commerce.services.CartService;

@RestController
@RequestMapping("/api/cart")
public class CartController {
    @Autowired
    private CartService cartService;

    @GetMapping("/{product_id}")
    public ResponseEntity<String> addProductToCart(@PathVariable("product_id") Long productId) {
        try {
            Cart cart = cartService.createCart(); // Create a new cart
            cartService.addProductToCart(cart.getId(), productId, 1); // Assuming a quantity of 1 for simplicity
            return ResponseEntity.ok("Product added to cart successfully");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Failed to add product to cart");
        }
    }
}

