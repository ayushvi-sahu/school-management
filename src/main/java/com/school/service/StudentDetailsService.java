package com.school.service;

import com.school.entity.Student;
import com.school.model.StudentModel;

public interface StudentDetailsService {
    Student saveStudent(StudentModel studentModel);
}
