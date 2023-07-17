package HomeWorks.HW5.View;

import HomeWorks.HW5.Controller.iGetView;
import HomeWorks.HW5.Model.Student;

import java.util.List;
import java.util.Scanner;

public class ViewRu implements iGetView {
    @Override
    public void printAllStudents(List<Student> students) {
        System.out.println("\n----------- Список студентов -----------\n");
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("\n = = = = = = = = = = = = = = = = = = = ");
    }

    @Override
    public void emptyModel() {
        System.out.println("Список студентов пуст");
    }

    @Override
    public void exit() {
        System.out.println("Выйти из программы");
    }

    @Override
    public void prompt() {
        System.out.println("Введите команду: ");
    }

    @Override
    public long inputFromUserGetStudentId() {
        prompt();
        String input = new Scanner(System.in).nextLine();
        return Long.parseLong(input);
    }

    @Override
    public void deleteDone() {
        System.out.println("Удаление выполнено");
    }

    @Override
    public void deleteFalse() {
        System.out.println("Нет такого студента");
    }

    @Override
    public String inputFromUserMainMenu() {
        prompt();
        return new Scanner(System.in).nextLine();
    }
}
