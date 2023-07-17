package HomeWorks.HW5.Model;

import HomeWorks.HW5.Controller.iGetModel;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashModel implements iGetModel {

    Map<Long,Student> students;

    public HashModel(List<Student> students) {
        this.students = new HashMap<>();
        for (Student student : students) {
            if (!this.students.containsKey(student.getIdStudent()))
                this.students.put(student.getIdStudent(), student);
        }
    }

    @Override
    public List<Student> getAllStudents() {
        return students.values().stream().toList();
    }

    @Override
    public boolean delete(long idStudent) {
        if (students.containsKey(idStudent)) {
            students.remove(idStudent);
            return true;
        }
        return false;
    }
}
