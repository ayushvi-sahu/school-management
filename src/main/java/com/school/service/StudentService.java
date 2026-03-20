package com.school.service;

import com.school.model.StudentModel;
import com.school.entity.Student;
import com.school.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;

    public Student saveStudent(StudentModel model) {

        Student student = new Student();

        student.setStudentName(model.getStudentName());
        student.setRollNumber(model.getRollNumber());
        student.setClassName(model.getClassName());
        student.setSection(model.getSection());
        student.setAddress(model.getAddress());
        student.setDateOfBirth(model.getDateOfBirth());
        return studentRepo.save(student);
    }
}
