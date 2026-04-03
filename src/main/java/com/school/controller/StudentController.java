package com.school.controller;

import com.school.model.StudentModel;
import com.school.entity.Student;
import com.school.service.StudentDetailsService;
import com.school.service.impl.StudentDetailsServiceImpl;
import lombok.Getter;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
@Getter
public class StudentController {

    private final StudentDetailsService studentDetailsService;

    public StudentController(StudentDetailsServiceImpl studentService, StudentDetailsService studentDetailsService) {
        this.studentDetailsService = studentDetailsService;
    }

    @PostMapping("/add")
    public Student addStudent(@RequestBody StudentModel studentModel) {
        return getStudentDetailsService().saveStudent(studentModel);
    }
}