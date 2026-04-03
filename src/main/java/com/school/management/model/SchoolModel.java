package com.school.management.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SchoolModel {

    private int schoolId;
    private int phoneNumber;
    private String schoolName;
    private String address;

}