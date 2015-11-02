package com.eds.model.dao;

import com.eds.model.dao.impl.CourseDAOImpl;
import com.eds.model.dao.impl.Person;
import com.eds.model.dao.impl.StudentImpl;

import java.util.List;
import java.util.Map;

/**
 * Created by vitaliy.vorona on 10/27/2015.
 */
public interface CourseDAO {
    public List<Person> getPersons();
    public int getCourseId();
    public String getName();
    public String getDescription();
    public String getEducator();
    public String getStartDate();
    public String getEndDate();
    public boolean changeCourse(CourseDAOImpl course, Person person);
    public boolean addStudent(Person person);
    public boolean deleteStudent(Person person);
}
