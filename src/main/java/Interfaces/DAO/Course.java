package Interfaces.DAO;

import java.util.List;

/**
 * Created by vitaliy.vorona on 10/27/2015.
 */
public interface Course {
    public List<Person> getPersons();
    public void getCourseId();
    public void getName();
    public void getDescription();
}
