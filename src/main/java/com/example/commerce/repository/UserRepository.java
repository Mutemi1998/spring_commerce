package com.example.commerce.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.commerce.dao.User;

@Repository
@Transactional(transactionManager = "chainedTransactionManager")
public interface UserRepository extends CrudRepository<User, Long> {

    @Override
    @Transactional
    User save(User user);

    User findById(long id);

    List<User> findByLastname(String lastname);

    User findByEmail(String email);
}