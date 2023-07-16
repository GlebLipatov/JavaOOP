package HomeWorks.HW3.Services;

import HomeWorks.HW3.Domen.PersonComparator;
import HomeWorks.HW3.Domen.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentService implements iPersonService<Student> {
    private List<Student> students;

    public StudentService() {
        this.students = new ArrayList<>();
    }

    @Override
    public List<Student> getAll() {
        return students;
    }

    @Override
    public void create(String firstName, String lastName, int age) {
        Student student = new Student(firstName, lastName, age);
        students.add(student);
    }

    public void sortByFIOStudentList() {
        students.sort(new PersonComparator<Student>());
    }


}
