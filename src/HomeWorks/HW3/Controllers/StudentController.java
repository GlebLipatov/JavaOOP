package HomeWorks.HW3.Controllers;

import HomeWorks.HW3.Domen.Student;
import HomeWorks.HW3.Domen.Teacher;
import HomeWorks.HW3.Services.StudentService;

public class StudentController implements iPersonController<Student> {
    private final StudentService dataService = new StudentService();

    public StudentService getDataService() {
        return dataService;
    }

    @Override
    public void create(String firstName, String lastName, int age) {
        dataService.create(firstName, lastName, age);
        dataService.sortByFIOStudentList();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        for (Student student : dataService.getAll()) {
            stringBuilder.append(student.toString() + "\n");
        }
        return stringBuilder.toString();
    }
}
