package com.attendancemanagementsystem.repository;



import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepo extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username); // Custom method to find a user by username
}

