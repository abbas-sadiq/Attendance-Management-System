package com.attendancemanagementsystem.controller;

import com.attendancemanagementsystem.exceptions.ApiResponse;
import com.attendancemanagementsystem.model.Attendance;
import com.attendancemanagementsystem.service.AttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/attendance")
public class AttendanceController {

    @Autowired
    private AttendanceService attendanceService;

    @PostMapping
   public ResponseEntity<ApiResponse<Attendance>> addAttendance(@RequestBody Attendance attendance) {
        return ResponseEntity.ok(new ApiResponse<>(true,attendance,null));

    }

    @GetMapping
    public List<Attendance> getAllAttendanceRecords() {
        return attendanceService.getAllAttendanceRecords();
    }
}
