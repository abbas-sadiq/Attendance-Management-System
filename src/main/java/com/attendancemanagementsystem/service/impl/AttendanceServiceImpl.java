package com.attendancemanagementsystem.service.impl;




import com.attendancemanagementsystem.model.Attendance;
import com.attendancemanagementsystem.repository.AttendanceRepo;
import com.attendancemanagementsystem.service.AttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttendanceServiceImpl implements AttendanceService {

    @Autowired
    private AttendanceRepo attendanceRepo;

    public Attendance saveAttendance(Attendance attendance) {
        return attendanceRepo.save(attendance);
    }

    public List<Attendance> getAllAttendanceRecords() {
        return attendanceRepo.findAll();
    }
}
