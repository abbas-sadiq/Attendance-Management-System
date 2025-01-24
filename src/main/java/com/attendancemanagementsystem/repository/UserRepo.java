package com.attendancemanagementsystem.repository;

import com.attendancemanagementsystem.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username); // Custom query to find a user by username
}
