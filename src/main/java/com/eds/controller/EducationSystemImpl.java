package com.eds.controller;

import com.eds.model.dao.CourseDAO;
import com.eds.model.dao.db.DB;
import com.eds.model.dao.impl.CourseDAOImpl;
import com.eds.model.dao.impl.StudentImpl;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by vitaliy.vorona on 10/28/2015.
 */
public class EducationSystemImpl implements EducationSystem{

    HashMap<Integer, HashMap<Integer, ArrayList<String>>> studentsOfaCourse = DB.getDbSpawn().studentsOfaCourse;

    public String readFromInput(InputStream in){
        String line;
        Scanner scanner = new Scanner(in);
        line = scanner.nextLine();
        scanner.close();
        return line;
    }

    @Override
    public void makeACourse() {
        CourseDAOImpl course = new CourseDAOImpl();
        System.out.print("Course name: ");
        String courseName = readFromInput(System.in);
        course.setName(courseName);
        System.out.println("Course description: ");
        String courseDescription = readFromInput(System.in);
        course.setDescription(courseDescription);
        System.out.println("Start date: ");
        String courseStart = readFromInput(System.in);
        course.setStartDate(courseStart);
        System.out.println("End date: ");
        String courseEnd = readFromInput(System.in);
        course.setEndDate(courseEnd);
        DB.courses.add(course);
        DB.coursesName.add(course.getName());
        DB.
    }

    @Override
    public void printCourseInfo(CourseDAO courseDAO) {

        System.out.println("Course ID: " + courseDAO.getCourseId());
        System.out.println("Course name: " + courseDAO.getName());
        System.out.println("Course description: " + courseDAO.getDescription());
        System.out.println("Start date: " + courseDAO.getStartDate());
        System.out.println("End date: " + courseDAO.getEndDate());
        //TODO make sure to implement ENUM for days
        System.out.println("make sure to implement ENUM for days: " + courseDAO.getCourseId());
    }

    @Override
    public void printCoursesList() {
        for (CourseDAO course : DB.courses){
            course.getName();
        }
    }

    @Override
    public void makeAStudentWithinACourse(int courseId) {
        StudentImpl student = new StudentImpl();
        System.out.print("Student name: ");
        String studentName = readFromInput(System.in);
        student.setName(studentName);


        System.out.print("Student surname: ");
        String studentSurname = readFromInput(System.in);
        student.setSurname(studentSurname);

        DB.studentsAndTasks.put(student.getId(), DB.coursesName);
    }

    @Override
    public void makeAnEducatorWithinACourse() {

    }

    @Override
    public void printStudentInfo() {

    }

    @Override
    public void printStudentsListViaCourseId() {

    }

    @Override
    public void printJournalProgressViaCourseId() {

    }

    @Override
    public void saveJournalProgressIntoFile() {

    }

    @Override
    public void printEducatorInfo() {

    }

    @Override
    public void makeACourseTasks() {

    }

    @Override
    public void quit() {

    }

    @Override
    public void openSession() {

    }
}
