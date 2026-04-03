package com.school.service.impl;

import com.school.entity.School;
import com.school.model.SchoolModel;
import com.school.repository.SchoolRepo;
import com.school.service.SchoolDetailsService;
import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Getter
public class SchoolDetailsServiceImp implements SchoolDetailsService {

    private final SchoolRepo schoolRepo;

    public SchoolDetailsServiceImp(SchoolRepo schoolRepo) {
        this.schoolRepo = schoolRepo;
    }

    @Override
    public School saveSchool(SchoolModel model) {

        School school = new School();

        school.setSchoolName(model.getSchoolName());
        school.setAddress(model.getAddress());
        school.setPhoneNumber(model.getPhoneNumber());

        return getSchoolRepo().save(school);
    }

    @Override
    public List<School> getAllSchools() {
        return getSchoolRepo().findAll();
    }
}