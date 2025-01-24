package com.attendancemanagementsystem.service.impl;

import com.attendancemanagementsystem.model.Classes;
import com.attendancemanagementsystem.repository.ClassesRepo;
import com.attendancemanagementsystem.service.ClassesService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassesServiceImpl implements ClassesService {

    private final ClassesRepo classesRepo;

    public ClassesServiceImpl(ClassesRepo classesRepo) {
        this.classesRepo = classesRepo;
    }

    @Override
    public Classes createClass(Classes classes) {
        return classesRepo.save(classes);
    }

    @Override
    public List<Classes> getAllClasses() {
        return classesRepo.findAll();
    }

    @Override
    public Classes getClassById(Long id) {
        return classesRepo.findById(id).orElseThrow(() -> new RuntimeException("Class not found"));
    }

    @Override
    public Classes updateClass(Long id, Classes classes) {
        Classes existingClass = getClassById(id);
        existingClass.setClassName(classes.getClassName());
        existingClass.setBatch(classes.getBatch());
        existingClass.setUsers(classes.getUsers());
        return classesRepo.save(existingClass);
    }

    @Override
    public void deleteClass(Long id) {
        classesRepo.deleteById(id);
    }
}
