package com.attendancemanagementsystem.repository;

import com.attendancemanagementsystem.model.Classes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassesRepo extends JpaRepository<Classes, Long> {
}
