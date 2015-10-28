package com.eds.model.dao.impl;

import com.eds.model.dao.CourseDAO;
import com.eds.model.dao.PersonDAO;

import java.util.List;

/**
 * Created by vitaliy.vorona on 10/27/2015.
 */
public class StudentImpl implements PersonDAO {
    private final String name;
    private final String surname;
    private int Id = 1;

    public List<CourseDAO> getAllCourses() {
        return null;
    }

    public Long getId() {

        return null;
    }

    public String getName() {

        return null;
    }

    public String getSurname() {

        return null;
    }

    public StudentImpl(String name, String surname) {
        this.name = name;
        this.surname = surname;
        Id++;
    }
}
