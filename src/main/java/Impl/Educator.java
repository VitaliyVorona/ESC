package Impl;

import Interfaces.Course;
import Interfaces.Person;

import java.util.List;

/**
 * Created by vitaliy.vorona on 10/27/2015.
 */
public class Educator implements Person {
    private final String name;
    private final String surname;

    public List<Course> getAllCourses() {
        return null;
    }

    public void getId() {

    }

    public void getName() {

    }

    public void getSurname() {

    }

    public Educator(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
}
