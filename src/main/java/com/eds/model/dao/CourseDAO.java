package com.eds.model.dao;

import com.eds.model.dao.impl.Person;

import java.util.List;
import java.util.Map;

/**
 * Created by vitaliy.vorona on 10/27/2015.
 */
public interface CourseDAO {
    public List<Person> getPersons();
    public Long getCourseId();
    public String getName();
    public String getDescription();
    public String getEducator();
    public String getStartDate();
    public String getEndDate();
    public boolean changeCourse();
    public boolean addStudent();
    public boolean deleteStudent();
}
