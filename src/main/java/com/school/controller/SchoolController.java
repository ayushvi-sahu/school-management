package com.school.controller;

import com.school.entity.School;
import com.school.model.SchoolModel;
import com.school.service.SchoolService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/school")
public class SchoolController {

    @Autowired
    private SchoolService schoolService;


    @PostMapping("/add")
    public School addSchool(@RequestBody SchoolModel model){
        return schoolService.saveSchool(model);
    }

    @GetMapping("/all")
    public List<School> getAllSchools(){
        return schoolService.getAllSchools();
    }
}