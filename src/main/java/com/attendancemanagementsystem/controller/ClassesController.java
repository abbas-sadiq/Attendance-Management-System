package com.attendancemanagementsystem.controller;

import com.attendancemanagementsystem.model.Classes;
import com.attendancemanagementsystem.service.ClassesService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/classes")
public class ClassesController {

    private final ClassesService classesService;

    public ClassesController(ClassesService classesService) {
        this.classesService = classesService;
    }

    @PostMapping
    public ResponseEntity<Classes> createClass(@RequestBody Classes classes) {
        return ResponseEntity.ok(classesService.createClass(classes));
    }

    @GetMapping
    public ResponseEntity<List<Classes>> getAllClasses() {
        return ResponseEntity.ok(classesService.getAllClasses());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Classes> getClassById(@PathVariable Long id) {
        return ResponseEntity.ok(classesService.getClassById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Classes> updateClass(@PathVariable Long id, @RequestBody Classes classes) {
        return ResponseEntity.ok(classesService.updateClass(id, classes));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteClass(@PathVariable Long id) {
        classesService.deleteClass(id);
        return ResponseEntity.noContent().build();
    }
}
