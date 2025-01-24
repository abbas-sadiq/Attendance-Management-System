package com.attendancemanagementsystem.model;

import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment ID
    private Long id;

    @Column(nullable = false, unique = true) // Username must be unique and not null
    private String username;

    @Column(nullable = false) // Password cannot be null
    private String password;

    @Column(nullable = false) // Full name cannot be null
    private String fullName;

    @Column(nullable = false, unique = true) // Email must be unique and not null
    private String email;

    @Column(nullable = false) // Role cannot be null
    private String role; // Example: "Admin", "Teacher", "Student"

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Attendance> attendanceRecords; // Relationship with Attendance

    // Default Constructor
    public User() {
    }

    // Parameterized Constructor
    public User(String username, String password, String fullName, String email, String role) {
        this.username = username;
        this.password = password;
        this.fullName = fullName;
        this.email = email;
        this.role = role;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Set<Attendance> getAttendanceRecords() {
        return attendanceRecords;
    }

    public void setAttendanceRecords(Set<Attendance> attendanceRecords) {
        this.attendanceRecords = attendanceRecords;
    }
}
