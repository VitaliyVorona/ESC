package com.eds.model.dao.impl;

import com.eds.model.dao.CourseDAO;
import com.eds.model.dao.db.DB;
import com.eds.model.entities.Educator;

import java.util.List;

//import com.eds.model.entities.Student;

/**
 * Created by vitaliy.vorona on 10/27/2015.
 */
public class CourseDAOImpl implements CourseDAO {

    private String startDate;
    private String endDate;
    private Educator educator;
    private String name;
    private static int courseInstance = 0;
    int id;
    private String description;
    List<Person> students = DB.getDbSpawn().students;


    public CourseDAOImpl(List<Person> students) {
        courseInstance++;
        id = courseInstance;
    }

    public CourseDAOImpl() {
        courseInstance++;
        id = courseInstance;
    }

    public List<Person> getPersons() {
        return students;
    }

    public void printStudens() {
        for (Person student : students) {
            System.out.println(student.getName() + " " + student.getSurname());
        }
    }

    public String getEducator() {
        return educator.getEducator();
    }

    public void setEducator(Educator educator) {
        this.educator = educator;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String dateEnd) {
        this.endDate = dateEnd;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String dateStart) {
        this.endDate = dateStart;
    }

    public int getCourseId() {
        return this.id;
    }

    public void setCourseId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean changeCourse(CourseDAOImpl course, Person student) {
        course.addStudent(student);
        if (this.deleteStudent(students.get(student.getId()))) return true;
        else return false;
    }

    @Override
    public boolean addStudent(Person person) {
        if (DB.students.get(person.getId()).equals(true)){}
        students.add(students.size(), person);
        return true;
    }

    public boolean addStudent(Person... person) {
        int personsNum = person.length;
        for (Person p : person) {
            students.add(p);
        }
        return true;
    }

    public boolean deleteStudent(Person student) {
        this.students.remove(student.getId());
        if (students.get(student.getId()) != null) {
            return false;
        } else return true;
    }
}
