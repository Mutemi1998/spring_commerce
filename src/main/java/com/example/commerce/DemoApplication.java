package com.example.commerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.example.commerce.dao.User;
import com.example.commerce.repository.UserRepository;
import com.example.commerce.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;


@SpringBootApplication
@EntityScan("com.example.commerce.dao")
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
