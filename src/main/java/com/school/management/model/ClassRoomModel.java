package com.school.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClassRoomModel {

    private String standard;
    private String section;
    private int schoolId; // Foreign key
}