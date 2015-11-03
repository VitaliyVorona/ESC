package com.eds.model.dao.impl;

import com.eds.model.dao.CourseDAO;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vitaliy.vorona on 10/27/2015.
 */
public class StudentImpl extends Person {
    private String name;
    private String surname;
    static private int instanceCounter = 0;
    int id = 0;

    public List<CourseDAO> getAllCourses() {
        List<CourseDAO> courseDAO = new ArrayList<CourseDAO>();

        return courseDAO;
    }



    public void printAllCourses(){
        List<CourseDAO> courseDAO = getAllCourses();
    }

    public int getId() { return this.id; }
    public void setId(int id){
        this.id = id;
    }

    public String getName() { return this.name; }
    public void setName(String name){
        this.name = name;
    }

    public String getSurname() { return this.surname; }
    public void setSurname(String surname){
        this.surname = surname;
    }

    public StudentImpl(){
        instanceCounter++;
        id = instanceCounter;
    }

    public StudentImpl(String name, String surname) {
        this.name = name;
        this.surname = surname;
        instanceCounter++;
        id = instanceCounter;
    }
}
