package com.school.service;

import com.school.entity.School;
import com.school.model.SchoolModel;
import com.school.repository.SchoolRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolService {

    @Autowired
    private SchoolRepo schoolRepo;

    public School saveSchool(SchoolModel model) {

        School school = new School();

        school.setSchoolName(model.getSchoolName());
        school.setAddress(model.getAddress());
        school.setPhoneNumber(model.getPhoneNumber());

        return schoolRepo.save(school);
    }

    public List<School> getAllSchools() {
        return schoolRepo.findAll();
    }
}