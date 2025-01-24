package com.attendancemanagementsystem.service;

import com.attendancemanagementsystem.model.Classes;

import java.util.List;

public interface ClassesService {
    Classes createClass(Classes classes);
    List<Classes> getAllClasses();
    Classes getClassById(Long id);
    Classes updateClass(Long id, Classes classes);
    void deleteClass(Long id);
}
