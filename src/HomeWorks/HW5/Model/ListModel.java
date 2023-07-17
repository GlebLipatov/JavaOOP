package HomeWorks.HW5.Model;

import HomeWorks.HW5.Controller.iGetModel;

import java.util.List;

public class ListModel implements iGetModel {
    private List<Student> students;

    public ListModel(List<Student> students) {
        this.students = students;
    }

    @Override
    public List<Student> getAllStudents() {
        return students;
    }

    @Override
    public boolean delete(long idStudent) {
        long id;
        for (int i = 0; i < students.size(); i++) {
            id = students.get(i).getIdStudent();
            if (id == idStudent) {
                students.remove(i);
                return true;
            }
        }
        return false;
    }
}
