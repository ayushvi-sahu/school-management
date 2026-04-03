package com.school.management.service.impl;

import com.school.management.entity.School;
import com.school.management.model.SchoolModel;
import com.school.management.repository.SchoolRepo;
import com.school.management.service.SchoolDetailsService;
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