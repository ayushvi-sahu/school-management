package com.school.management.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentModel {
    private String studentName;
    private String rollNumber;
    private String className;
    private String section;
    private String address;
    private String dateOfBirth;
}