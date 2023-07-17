package HomeWorks.HW5;


import HomeWorks.HW5.Controller.Controller;
import HomeWorks.HW5.Controller.iGetModel;
import HomeWorks.HW5.Controller.iGetView;
import HomeWorks.HW5.Model.HashModel;
import HomeWorks.HW5.Model.ListModel;
import HomeWorks.HW5.Model.Student;
import HomeWorks.HW5.View.ViewEng;
import HomeWorks.HW5.View.ViewRu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        // создаем студентов
        Student student1 = new Student("Ivan", 19);
        Student student2 = new Student("Petr", 20);
        Student student3 = new Student("Alex", 21);
        Student student4 = new Student("Nick", 18);
        Student student5 = new Student("Anna", 19);
        // добавляем в лист
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        // создаем различные модели и вьюшки из дз
        iGetModel modelList = new ListModel(students);
        iGetModel modelMap = new HashModel(students);
        iGetView viewRu = new ViewRu();
        iGetView viewEng = new ViewEng();

        iGetView view;

        // Меню выбора языка начало

        System.out.println(1 + "- Ru\n" + 2 + "- Eng");
        System.out.println("Выберите язык: ");
        // Получаем данные от пользователя
        String input = new Scanner(System.in).nextLine();
        int inputChoiceLang = Integer.parseInt(input);

        // Выбор языка на основе полученных данных от пользователя
        if (inputChoiceLang == 1) view = viewRu;
        else view = viewEng;

        // Меню выбора языка конец

        Controller controller = new Controller(modelMap, view);
        // Проверка как работы с разными моделями
        // Controller controller = new Controller(modelList, view);

        controller.run();

    }
}
