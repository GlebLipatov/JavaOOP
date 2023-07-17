package HomeWorks.HW5.View;

import HomeWorks.HW5.Controller.iGetView;
import HomeWorks.HW5.Model.Student;

import java.util.List;
import java.util.Scanner;

public class ViewEng implements iGetView {
    @Override
    public void printAllStudents(List<Student> students) {
        System.out.println("\n----------- Student List -----------\n");
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("\n = = = = = = = = = = = = = = = = = = = ");
    }

    @Override
    public void emptyModel() {
        System.out.println("Student list is empty");
    }

    @Override
    public void exit() {
        System.out.println("Exit");
    }

    @Override
    public void prompt() {
        System.out.println("Enter command: ");
    }

    @Override
    public long inputFromUserGetStudentId() {
        prompt();
        String input = new Scanner(System.in).nextLine();
        return Long.parseLong(input);
    }

    @Override
    public void deleteDone() {
        System.out.println("Delete complete");
    }

    @Override
    public void deleteFalse() {
        System.out.println("There id no such student");
    }

    @Override
    public String inputFromUserMainMenu() {
        prompt();
        return new Scanner(System.in).nextLine();
    }
}
