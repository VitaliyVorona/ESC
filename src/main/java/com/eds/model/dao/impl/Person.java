package com.eds.model.dao.impl;

import com.eds.model.dao.CourseDAO;
import com.eds.model.dao.PersonDAO;

import java.util.List;

/**
 * Created by vitaliy.vorona on 10/28/2015.
 */

//TODO: think if we need abstract class Person
public abstract class Person implements PersonDAO{

    @Override
    public List<CourseDAO> getAllCourses() {
        return null;
    }

    @Override
    public int getId() {return 0; }

    @Override
    public void setId(int id){}

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setName(String name){}

    @Override
    public String getSurname() { return null; }

    @Override
    public void setSurname(String surname){}
}
