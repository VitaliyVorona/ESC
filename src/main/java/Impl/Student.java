package Impl;

import Interfaces.DAO.Course;
import Interfaces.DAO.Person;

import java.util.List;

/**
 * Created by vitaliy.vorona on 10/27/2015.
 */
public class Student implements Person {
    private final String name;
    private final String surname;
    private int Id = 1;

    public List<Course> getAllCourses() {
        return null;
    }

    public void getId() {

    }

    public void getName() {

    }

    public void getSurname() {

    }

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
        Id++;
    }
}
