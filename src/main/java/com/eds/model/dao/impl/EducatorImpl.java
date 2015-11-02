package com.eds.model.dao.impl;

import com.eds.model.dao.CourseDAO;
import com.eds.model.dao.PersonDAO;
import com.eds.model.entities.Course;

import java.util.List;

/**
 * Created by vitaliy.vorona on 10/27/2015.
 */
public class EducatorImpl implements PersonDAO {
    private String name;
    private String surname;
    private int id;

    public List<CourseDAO> getAllCourses() {

        return null;
    }

    public int getId() { return this.id; }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() { return this.name; }
    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public EducatorImpl() {
    }

    public EducatorImpl(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
}
