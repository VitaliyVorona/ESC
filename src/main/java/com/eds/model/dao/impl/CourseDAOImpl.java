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
    List<StudentImpl> students;

    public CourseDAOImpl(){

    }

    public CourseDAOImpl(List<StudentImpl> students ){
        students = new ArrayList<StudentImpl>();
    }

    public List<Person> getPersons(){
        return (Person)students;
    }

    public String getEducator() {
        return educator.getEducator();
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
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
