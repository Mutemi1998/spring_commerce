package com.example.commerce.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import com.example.commerce.Request.UserRequest;
import com.example.commerce.dao.User;
import com.example.commerce.repository.UserRepository;

@Service
public class UserService {
    private final UserRepository userRepository;
    
    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    
    public User createUser(String email,String firstname,String lastname, int age, String password) {
        User user = new User(null, email,firstname,lastname, age, password);
        return userRepository.save(user);
    }
    
    public User updateUser(Long id, UserRequest userrequest) {
        User user = userRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("User not with id "+ id + " found"));
        user = new User(user.getId(), userrequest.getEmail(), userrequest.getFirstname(),userrequest.getLastname(), userrequest.getAge(), userrequest.getPassword());
        return userRepository.save(user);
    }
    
    public boolean deleteUser(Long id) {
        userRepository.deleteById(id);
        return true;
    }
    
    public Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }
    
    public User getUserById(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("User with id "+ id +" not found"));
    }

    public  List<User> findByLastName(String lastname) {
        return userRepository.findByLastname(lastname);
    
    }

    public  User findByEmail(String email) {
        return userRepository.findByEmail(email);
    
    }
}

