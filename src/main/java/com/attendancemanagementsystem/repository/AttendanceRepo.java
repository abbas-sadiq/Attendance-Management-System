package com.attendancemanagementsystem.repository;

import com.attendancemanagementsystem.model.Attendance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttendanceRepo extends JpaRepository<Attendance, Long> {
}
