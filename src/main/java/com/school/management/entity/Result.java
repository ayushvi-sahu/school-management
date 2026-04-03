package com.school.management.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Result {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int resultId;

    private int marks;
    private String grade;

    // Many results belong to one student
    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    // Many results belong to one exam
    @ManyToOne
    @JoinColumn(name = "exam_id")
    private Exam exam;
}
