package HomeWorks.HW3;

import HomeWorks.HW3.Controllers.EmploeeController;
import HomeWorks.HW3.Controllers.StudentController;
import HomeWorks.HW3.Controllers.TeacherController;
import HomeWorks.HW3.Domen.Emploee;
import HomeWorks.HW3.Domen.Student;
import HomeWorks.HW3.Domen.Teacher;
import HomeWorks.HW3.Services.AveregeAge;

import java.util.ArrayList;
import java.util.Random;

public class App {

    public static  void main(String[] args) {

        TeacherController teacherController = new TeacherController();
        StudentController studentController = new StudentController();
        EmploeeController emploeeController = new EmploeeController();

        // Переменная, которая хранит кол-во созданных студентов, учителей и работников
        int countPersons = 5;

        // Эти циклы создают учителей, студентов и работников
        // и добавляют их в соответствующий контроллер
        for (int i = 1; i < countPersons; i++) {
            String firstName = "fn" + (countPersons - i);
            String lastName = "ln" + (countPersons - i);
            int age = new Random().nextInt(30, 60);
            teacherController.create(firstName, lastName, age);
        }

        for (int i = 1; i < countPersons; i++) {
            String firstName = "fn" + (countPersons - i);
            String lastName = "ln" + (countPersons - i);
            int age = new Random().nextInt(18, 30);
            studentController.create(firstName, lastName, age);
        }

        for (int i = 1; i < countPersons; i++) {
            String firstName = "fn" + (countPersons - i);
            String lastName = "ln" + (countPersons - i);
            int age = new Random().nextInt(18, 60);
            emploeeController.create(firstName, lastName, age);
        }

        System.out.println("Учителя до сортировки\n" + teacherController.toString());

        teacherController.getDataService().sortByFIOTeachersList();

        System.out.println("Учителя после сортировки\n" + teacherController.toString());

        // сохраняем списки всех студентов и тд в переменные
        ArrayList<Student> students = (ArrayList<Student>) studentController.getDataService().getAll();
        ArrayList<Teacher> teachers = (ArrayList<Teacher>) teacherController.getDataService().getAll();
        ArrayList<Emploee> emploees = (ArrayList<Emploee>) emploeeController.getDataService().getAll();

        // Создаем экземпляры обобщенных классов
        // с соответствующими классами для подсчета среднего возраста 
        AveregeAge<Student> avgAgeStudent = new AveregeAge<>();
        AveregeAge<Teacher> avgAgeTeacher = new AveregeAge<>();
        AveregeAge<Emploee> avgAgeEmploee = new AveregeAge<>();

        String avgAge = "Средний возраст ";
        System.out.println(studentController.toString());
        System.out.println(avgAge + "студентов: " + avgAgeStudent.averageAge(students) + "\n");

        System.out.println(teacherController.toString());
        System.out.println(avgAge + "учителей: " + avgAgeTeacher.averageAge(teachers) + "\n");

        System.out.println(emploeeController.toString());
        System.out.println(avgAge + "сотрудников: " + avgAgeEmploee.averageAge(emploees) + "\n");


    }
}
