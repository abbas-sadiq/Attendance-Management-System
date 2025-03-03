package com.attendancemanagementsystem.model;

import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name = "classes") // Maps to the "classes" table in the database
public class Classes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment ID
    private Long id;

    @Column(nullable = false)
    private String className; // Name of the class (e.g., "Math 101", "History")

    @ManyToOne(fetch = FetchType.LAZY) // A class belongs to a single batch
    @JoinColumn(name = "batch_id")
    private Batch batch;


    @ManyToMany(fetch = FetchType.LAZY) // Classes can have multiple users
    @JoinTable(
            name = "class_users",
            joinColumns = @JoinColumn(name = "class_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id")
    )
    private Set<User> users;

    @ManyToOne
    @JoinColumn(name = "department_id") // Correct foreign key mapping
    private Department department; // Changed from 'departments' to 'department'

    public Classes() {
    }

    public Classes(String className, Batch batch) {
        this.className = className;
        this.batch = batch;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Batch getBatch() {
        return batch;
    }

    public void setBatch(Batch batch) {
        this.batch = batch;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
