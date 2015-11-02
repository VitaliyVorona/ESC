package com.eds.model.dao.impl;

import com.eds.model.dao.PersonDAO;
import com.eds.model.entities.Course;

import java.util.List;

/**
 * Created by vitaliy.vorona on 10/28/2015.
 */

//TODO: think if we need abstract class Person
public abstract class Person implements PersonDAO{

    @Override
    public List<Course> getAllCourses() {
        return null;
    }

    @Override
    public int getId() {
        return 0;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getSurname() {
        return null;
    }
}
