package com.school.management.controller;

import com.school.management.entity.School;
import com.school.management.model.SchoolModel;
import com.school.management.service.SchoolDetailsService;

import lombok.Getter;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/school")
@Getter
public class SchoolController {

    private final SchoolDetailsService schoolDetailsServiceService;

    public SchoolController(SchoolDetailsService schoolService, SchoolDetailsService schoolDetailsServiceService) {
        this.schoolDetailsServiceService = schoolDetailsServiceService;
    }


    @PostMapping("/add")
    public School addSchool(@RequestBody SchoolModel model){
        return getSchoolDetailsServiceService().saveSchool(model);
    }

    @GetMapping("/all")
    public List<School> getAllSchools(){
        return getSchoolDetailsServiceService().getAllSchools();
    }
}