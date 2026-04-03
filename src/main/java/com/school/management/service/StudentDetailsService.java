package com.school.management.service;

import com.school.management.entity.Student;
import com.school.management.model.StudentModel;

public interface StudentDetailsService {
    Student saveStudent(StudentModel studentModel);
}
