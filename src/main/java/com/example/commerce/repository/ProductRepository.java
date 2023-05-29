package com.example.commerce.repository;

import java.util.List;

import com.example.commerce.dao.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.commerce.dao.Product;

@Repository
public interface ProductRepository extends  CrudRepository <Product, Long> {

    @Override
    @Transactional
    Product save(Product user);

    Product findById(long id);

    List<Product> findByname(String name);

    List<Product> findByPrice(Double Price);
}
