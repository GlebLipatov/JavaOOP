package HomeWorks.HW5.Controller;

import HomeWorks.HW5.Model.Student;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private iGetModel model;
    private iGetView view;
    private List<Student> students;

    public Controller(iGetModel model, iGetView view) {
        this.model = model;
        this.view = view;
        this.students = new ArrayList<>();
    }

    /**
     * Проверяем список на наличие в нем студентов
     * @return true если есть и false если список пуст
     */
    private boolean testData() {
        if (!students.isEmpty()) return true;
        else return false;
    }

    /**
     * Выводит список студентов в консоль если они там есть.
     */
    public void update() {
        // MVP
        students = model.getAllStudents();
        if (testData()) view.printAllStudents(students);
        else view.emptyModel();

        // MVC
        view.printAllStudents(model.getAllStudents());
    }

    /**
     * Запускает программу
     */
    public void run() {
        Commands com = Commands.NONE;
        boolean getNewIterator = true;
        while(getNewIterator) {
            String command = view.inputFromUserMainMenu();
            com = Commands.valueOf(command.toUpperCase());
            switch (com) {
                case EXIT:
                    getNewIterator = false;
                    view.exit();
                    break;
                case LIST:
                    students = model.getAllStudents();
                    view.printAllStudents(students);
                    break;
                case DELETE:
                    long idStudent = view.inputFromUserGetStudentId();
                    boolean isDelete = model.delete(idStudent);
                    if (isDelete) view.deleteDone();
                    else view.deleteFalse();
            }
        }
    }
}
