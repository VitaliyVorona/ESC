package com.eds.model.dao.impl;

import com.eds.model.dao.CourseDAO;
import com.eds.model.dao.db.DB;
import com.eds.model.entities.Educator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
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
    public ArrayList<String> courseTasks;
    List<Person> students = DB.getDbSpawn().students;
    HashMap<Integer, HashMap<Integer, ArrayList<String>>> studentsOfaCourse = DB.getDbSpawn().studentsOfaCourse;
    public List<CourseDAO> courses =  DB.getDbSpawn().courses;



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

    public void printStudents() {
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
        if (isStudentPresent(course.studentsOfaCourse, student)){return false;}
        //course/students mapper
        HashMap<Integer, ArrayList<String>> map = course.studentsOfaCourse.get(getCourseId());
        map.put(student.getId(), course.courseTasks);
        return true;
    }

    @Override
    public boolean addStudent(Person student) {
        if (isStudentPresent(studentsOfaCourse, student)){return false;}
        HashMap<Integer, ArrayList<String>> map = this.studentsOfaCourse.get(this.getCourseId());
        map.put(this.getCourseId(), courseTasks);
        return true;
    }


    public boolean deleteStudent(Person student) {
        if (isStudentPresent(studentsOfaCourse, student)){return false;}
        HashMap<Integer, ArrayList<String>> map = this.studentsOfaCourse.get(this.getCourseId());
        map.remove(student.getId());
        return true;
    }

    private boolean isStudentPresent(HashMap<Integer, HashMap<Integer, ArrayList<String>>> studentsOfaCourse, Person student) {

        HashMap<Integer, ArrayList<String>> map = studentsOfaCourse.get(getCourseId());

        Iterator<Integer> keySetIterator = map.keySet().iterator();
        while (keySetIterator.hasNext()){
            Integer key = keySetIterator.next();
            if (key == student.getId()){return true;}
        }
        return false;
    }
}
