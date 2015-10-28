package com.eds.controller;

/**
 * Created by vitaliy.vorona on 10/27/2015.
 */
public interface EducationSystem {
    public void makeACourse(Course course);
    public void printCourseInfo();
    public void printCoursesList();
    public void makeAStudentWithinACourse();
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
