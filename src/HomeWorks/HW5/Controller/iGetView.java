package HomeWorks.HW5.Controller;

import HomeWorks.HW5.Model.Student;

import java.util.List;

public interface iGetView {

    void printAllStudents(List<Student> students);

    void emptyModel();

    void exit();

    void prompt();

    String inputFromUserMainMenu();

    long inputFromUserGetStudentId();

    void deleteDone();

    void deleteFalse();
}
