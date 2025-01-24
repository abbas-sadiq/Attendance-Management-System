package com.attendancemanagementsystem.controller;

import com.attendancemanagementsystem.model.Attendance;
import com.attendancemanagementsystem.service.AttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/attendance")
public class AttendanceController {

    @Autowired
    private AttendanceService attendanceService;

    @PostMapping
    public Attendance markAttendance(@RequestBody Attendance attendance) {
        return attendanceService.saveAttendance(attendance);
    }

    @GetMapping
    public List<Attendance> getAllAttendanceRecords() {
        return attendanceService.getAllAttendanceRecords();
    }
}
