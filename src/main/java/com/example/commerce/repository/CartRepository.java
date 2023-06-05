package com.example.commerce.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.commerce.dao.Cart;
public interface CartRepository  extends CrudRepository <Cart, Long>{
}