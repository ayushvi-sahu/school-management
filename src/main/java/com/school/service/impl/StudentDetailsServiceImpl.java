package com.school.service.impl;

import com.school.model.StudentModel;
import com.school.entity.Student;
import com.school.repository.StudentRepo;
import com.school.service.StudentDetailsService;
import lombok.Getter;
import org.springframework.stereotype.Service;

@Service
@Getter
public class StudentDetailsServiceImpl implements StudentDetailsService {

    private final StudentRepo studentRepo;

    public StudentDetailsServiceImpl(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    @Override
    public Student saveStudent(StudentModel studentModel) {

        Student student = new Student();

        student.setStudentName(studentModel.getStudentName());
        student.setRollNumber(studentModel.getRollNumber());
        student.setClassName(studentModel.getClassName());
        student.setSection(studentModel.getSection());
        student.setAddress(studentModel.getAddress());
        student.setDateOfBirth(studentModel.getDateOfBirth());

        return getStudentRepo().save(student);
    }
}
