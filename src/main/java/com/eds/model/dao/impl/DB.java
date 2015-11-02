package com.eds.model.dao.impl;

import com.eds.model.dao.CourseDAO;

import java.util.HashMap;
import java.util.List;

/**
 * Created by User on 02.11.2015.
 */
public class DB {

    private static DB db;
    List<Person> students;
    List<CourseDAO> courses;
    HashMap<CourseDAO, HashMap<Person, >>

    private static DB(){}
    public static DB getDbSpawn(){
        if (null == db){
            db = new DB();
        }
        return db;
    }
}
