package com.eds;

import com.eds.model.dao.db.DB;
import com.eds.model.dao.impl.CourseDAOImpl;
import com.eds.model.dao.impl.Person;
import com.eds.model.dao.impl.StudentImpl;

/**
 * Created by vitaliy.vorona on 10/27/2015.
 */
public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");

        Person student = new StudentImpl();
        Person student2 = new StudentImpl();
        Person student3 = new StudentImpl("Sergiy", "Hrusch");
        student.setName("Ivan");
        student2.setName("Kolyan");
        student.setSurname("Ivanov");
        student2.setSurname("Kolyanov");
        CourseDAOImpl courseDAO = new CourseDAOImpl();
        courseDAO.addStudent(student);
        DB db = DB.getDbSpawn();
        db.students.add(student);
        db.students.add(student2);
        db.students.add(student3);
        for (Person p : db.students) {
            System.out.println(p.getName());
            System.out.println(p.getSurname());
            System.out.println(p.getId());
        }

        CourseDAOImpl java = new CourseDAOImpl();
        java.setName("JAVA");
        java.setDescription("JAVA for beginners");
        java.addStudent(student, student2, student3);
        System.out.println("=========================");
        java.printStudens();
    }
}
