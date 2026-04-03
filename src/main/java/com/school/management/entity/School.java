package com.school.management.entity;

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
   @OneToMany(mappedBy = "school", cascade = CascadeType.ALL, orphanRemoval = true)
   private List<Student> students;

    @OneToMany(mappedBy = "school", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Teacher> teachers;

    @OneToMany(mappedBy = "school", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ClassRoom> classRooms;

}