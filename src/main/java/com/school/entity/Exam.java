package com.school.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
@Entity
public class Exam {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int examId;

    private String examType;
    private String examDate;

    @ManyToOne
    @JoinColumn(name = "school_id")
    private School school;

    // Many students can appear in many exams
    @ManyToMany(mappedBy = "exams")
    private List<Student> students;

    // One exam can have many results
    @OneToMany(mappedBy = "exam")
    private List<Result> results;
}