package com.eds.controller;

import com.eds.model.dao.CourseDAO;

/**
 * Created by vitaliy.vorona on 10/27/2015.
 */
public interface EducationSystem {
    public void makeACourse();
    public void printCourseInfo(CourseDAO courseDAO);
    public void printCoursesList();
    public void makeAStudentWithinACourse(int i);
    public void makeAnEducatorWithinACourse();
    public void printStudentInfo();
    public void printStudentsListViaCourseId();
    public void printJournalProgressViaCourseId();
    public void saveJournalProgressIntoFile();
    public void printEducatorInfo();
    public void makeACourseTasks();
    public void quit();
    public void openSession();

}
