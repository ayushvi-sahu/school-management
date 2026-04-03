package com.school.management.service;

import com.school.management.entity.School;
import com.school.management.model.SchoolModel;

import java.util.List;

public interface SchoolDetailsService {
    School saveSchool(SchoolModel model);
    List<School> getAllSchools();
}
