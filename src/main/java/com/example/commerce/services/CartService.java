package com.example.commerce.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.commerce.dao.Cart;
import com.example.commerce.dao.CartItem;
import com.example.commerce.dao.Product;
import com.example.commerce.repository.CartRepository;
import com.example.commerce.repository.ProductRepository;

@Service
public class CartService {
    @Autowired
    private CartRepository cartRepository;

    @Autowired
    private ProductRepository productRepository;

    public void addProductToCart(Long cartId, Long productId, int quantity) {
        Cart cart = cartRepository.findById(cartId)
                .orElseThrow(() -> new RuntimeException("Cart not found"));

        Product product = productRepository.findById(productId)
                .orElseThrow(() -> new RuntimeException("Product not found"));

        CartItem cartItem = new CartItem(cart, product, quantity);
        cart.addCartItem(cartItem);

        cartRepository.save(cart);
    }

    public Cart createCart() {
        Cart cart = new Cart();
        // Set any additional properties of the cart if needed
        cartRepository.save(cart);
        return cart;
    }
}
