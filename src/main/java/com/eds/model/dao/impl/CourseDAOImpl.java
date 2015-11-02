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

    private String startDate;
    private String endDate;
    private Educator educator;
    private String name;
    private int id = 0;
    private String description;
    List<Person> students;


    public CourseDAOImpl(List<Person> students) {
        students = new ArrayList<Person>();
        id++;
    }

    public List<Person> getPersons() {
        return students;
    }

    public void printStudens(){
        List<Person> studentList = getPersons();
        for (Person student : studentList){
            System.out.println(student.getName() + student.getSurname());
        }
    }

    public String getEducator() { return educator.getEducator(); }

    public void setEducator(Educator educator){this.educator = educator;}

    public String getEndDate() { return endDate; }

    public String getStartDate() { return startDate; }

    public int getCourseId() { return this.id; }

    public void setCourseId(int id) { this.id = id; }

    public String getName() { return this.name; }

    public String getDescription() { return description; }

    @Override
    public boolean changeCourse(CourseDAOImpl course, Person student) {
        course.addStudent(student);
        if (this.deleteStudent(students.get(student.getId()))) return true;
        else return false;
    }

    @Override
    public boolean addStudent(Person person) {

        students.add(students.size() + 1, person) ;
        return false;
    }

    public boolean deleteStudent(Person student) {
        this.students.remove(student.getId());
        if (students.get(student.getId()) != null){
            return false;
        }
        else return true;
    }
}
