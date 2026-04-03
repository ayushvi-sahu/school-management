package com.school.service;

import com.school.entity.School;
import com.school.model.SchoolModel;

import java.util.List;

public interface SchoolDetailsService {
    School saveSchool(SchoolModel model);
    List<School> getAllSchools();
}
