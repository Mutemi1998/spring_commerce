package com.example.commerce.Errors;

public class UserNotFoundException extends RuntimeException {
    private String userId;
  
    public UserNotFoundException(String string) {
      super(string);
      this.userId = string;
    }
  
    public String getUserId() {
      return userId;
    }
  }