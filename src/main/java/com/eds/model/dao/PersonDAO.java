package com.eds.model.dao;

import java.util.List;

/**
 * Created by vitaliy.vorona on 10/27/2015.
 */
public interface PersonDAO {
    public List<CourseDAO> getAllCourses();
    public int getId();
    public void setId(int id);
    public String getName();
    public void setName(String name);
    public String getSurname();
    public void setSurname(String surname);

}
