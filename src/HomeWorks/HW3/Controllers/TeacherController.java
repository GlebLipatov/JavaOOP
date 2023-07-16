package HomeWorks.HW3.Controllers;

import HomeWorks.HW3.Domen.Teacher;
import HomeWorks.HW3.Services.TeacherService;

public class TeacherController implements iPersonController<Teacher> {
    private static final TeacherService dataService = new TeacherService();
    @Override
    public void create(String firstName, String lastName, int age) {
        dataService.create(firstName, lastName, age);
    }

    public TeacherService getDataService() {
        return dataService;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        for (Teacher teacher : dataService.getAll()) {
            stringBuilder.append(teacher.toString() + "\n");
        }
        return stringBuilder.toString();
    }
}
