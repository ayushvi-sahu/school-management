package com.school.management.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
@Entity
public class ClassRoom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int classId;

    private String standard;
    private String section;

    @ManyToOne
    private School school;

    @OneToMany(mappedBy = "classRoom", cascade = CascadeType.ALL)
    private List<Subject> subjects;

    @OneToMany(mappedBy = "classRoom", cascade = CascadeType.ALL)
    private List<Teacher> teachers;

    @OneToMany(mappedBy = "classRoom")
    private List<Student> students;
}