package com.school.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
@Entity
public class School {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int schoolId;

    private int phoneNumber;
    private String schoolName;
    private String address;

    //@OneToMany(mappedBy = "school")
    //private List<ClassRoom> classRooms;

   // @OneToMany(mappedBy = "school")
   // private List<Teacher> teachers;
}