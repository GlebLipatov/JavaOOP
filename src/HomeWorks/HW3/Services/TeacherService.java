package HomeWorks.HW3.Services;

import HomeWorks.HW3.Domen.PersonComparator;
import HomeWorks.HW3.Domen.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherService implements iPersonService<Teacher> {

    private List<Teacher> teachers;

    public TeacherService() {
        this.teachers = new ArrayList<>();
    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    @Override
    public void create(String firstName, String lastName, int age) {
        Teacher teacher = new Teacher(firstName, lastName, age);
        teacher.setAcadDegree("Some subject");
        teachers.add(teacher);
    }

    public void sortByFIOTeachersList() {
        teachers.sort(new PersonComparator<Teacher>());
    }
}
