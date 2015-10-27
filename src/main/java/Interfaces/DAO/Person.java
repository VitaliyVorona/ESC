package Interfaces.DAO;

import java.util.List;

/**
 * Created by vitaliy.vorona on 10/27/2015.
 */
public interface Person {
    public List<Course> getAllCourses();
    public void getId();
    public void getName();
    public void getSurname();

}
