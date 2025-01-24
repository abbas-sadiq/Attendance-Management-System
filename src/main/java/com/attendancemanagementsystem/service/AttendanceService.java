package com.attendancemanagementsystem.service;

import com.attendancemanagementsystem.model.Attendance;

import java.util.List;

public interface AttendanceService {
    List<Attendance> getAllAttendanceRecords();

    Attendance saveAttendance(Attendance attendance);
}
