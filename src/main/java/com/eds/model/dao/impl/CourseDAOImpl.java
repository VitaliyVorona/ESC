package com.eds.model.dao.impl;

import com.eds.model.dao.CourseDAO;
import com.eds.model.dao.PersonDAO;
import com.eds.model.entities.Educator;
import com.eds.model.entities.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vitaliy.vorona on 10/27/2015.
 */
public class CourseDAOImpl implements CourseDAO {

    String startDate;
    String endDate;
    Educator educator;
    List<Student> students;
    List<Person> persons;
    public CourseDAOImpl(){
        students = new ArrayList<Student>();
        persons = new ArrayList<Person>();
    }

    public String getEducator() {
        return persons.get(0).toString();
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public List<Person> getPersons() {
        return persons;
    }

    public Long getCourseId() {

        return null;
    }

    public String getName() {

        return null;
    }

    public String getDescription() {

        return null;
    }

    public boolean changeCourse() {
        return false;
    }

    public boolean addStudent() {
        return false;
    }

    public boolean deleteStudent() {
        return false;
    }
}
