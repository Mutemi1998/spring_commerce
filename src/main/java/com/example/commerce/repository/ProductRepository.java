package com.example.commerce.repository;

import com.example.commerce.dao.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional(transactionManager = "chainedTransactionManager")
public interface ProductRepository extends CrudRepository<Product, Long> {

    @Override
    @Transactional
    Product save(Product product);

    Product findById(long id);

    List<Product> findByCategory(String category);

    List<Product> findByAvailable(boolean available);
}

