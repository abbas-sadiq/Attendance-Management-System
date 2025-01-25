package com.attendancemanagementsystem.service;

import com.attendancemanagementsystem.model.Department;

import java.util.List;

public interface DepartmentService {
    Department createDepartment(Department department);
    List<Department> getAllDepartments();
    Department getDepartmentById(Long id);
    Department updateDepartment(Long id, Department department);
    void deleteDepartment(Long id);
}
