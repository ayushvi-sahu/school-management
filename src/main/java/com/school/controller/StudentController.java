package com.school.controller;

import com.school.model.StudentModel;
import com.school.entity.Student;
import com.school.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public Student addStudent(@RequestBody StudentModel studentDTO) {
        return studentService.saveStudent(studentDTO);


    }
}