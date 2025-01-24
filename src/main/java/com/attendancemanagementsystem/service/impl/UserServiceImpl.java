package com.attendancemanagementsystem.service.impl;

import com.attendancemanagementsystem.model.User;
import com.attendancemanagementsystem.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl {

    @Autowired
    private UserRepo userRepo;

    // Save a new user
    public User saveUser(User user) {
        return userRepo.save(user);
    }

    // Get a user by ID
    public User getUserById(Long id) {
        return userRepo.findById(id).orElse(null);
    }

    // Get a user by username
    public User getUserByUsername(String username) {
        return userRepo.findByUsername(username);
    }

    // Get all users
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    // Delete a user by ID
    public void deleteUserById(Long id) {
        userRepo.deleteById(id);
    }
}

