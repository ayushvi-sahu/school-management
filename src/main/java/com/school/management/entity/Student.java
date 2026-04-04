package com.school.management.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studentId;
    private String className;
    private String dateOfBirth;
    private String studentName;
    private String className;
    private String rollNumber;
    private String section;
    private String address;

    @ManyToOne
    @JoinColumn(name = "school_id")
    @JsonIgnoreProperties({"students", "teachers", "classRooms"})
    private School school;

    @ManyToOne
    @JoinColumn(name = "classroom_id")
    @JsonIgnoreProperties({"students", "teachers", "subjects", "school"})
    private ClassRoom classRoom;


    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Result> results;

    @ManyToMany
    @JoinTable(
            name = "student_exam",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "exam_id")
    )
    private List<Exam> exams;
}




