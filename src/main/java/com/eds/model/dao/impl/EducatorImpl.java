package com.eds.model.dao.impl;

import com.eds.model.dao.CourseDAO;
import com.eds.model.dao.PersonDAO;
import com.eds.model.entities.Course;

import java.util.List;

/**
 * Created by vitaliy.vorona on 10/27/2015.
 */
public class EducatorImpl extends Person {
    private final String name;
    private final String surname;
    private Long id;

    public List<Course> getAllCourses() {
        return null;
    }

    public Long getId() {

        return id;
    }

    public String getName() {

        return null;
    }

    public String getSurname() {

        return null;
    }



    public EducatorImpl(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
}
