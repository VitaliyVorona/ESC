package com.eds.model.dao;

import com.eds.model.dao.impl.CourseDAOImpl;
import com.eds.model.entities.Course;

import java.util.List;

/**
 * Created by vitaliy.vorona on 10/27/2015.
 */
public interface PersonDAO {
    public List<Course> getAllCourses();
    public int getId();
    public String getName();
    public String getSurname();

}
