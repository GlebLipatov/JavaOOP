package HomeWorks.HW3.Services;

import HomeWorks.HW3.Domen.Emploee;

import java.util.ArrayList;
import java.util.List;

public class EmploeeService implements iPersonService<Emploee> {
    private List<Emploee> employees;

    public EmploeeService() {
        this.employees = new ArrayList<>();
    }

    @Override
    public List<Emploee> getAll() {
        return employees;
    }

    @Override
    public void create(String firstName, String lastName, int age) {
        Emploee emploee = new Emploee(firstName, lastName, age);
        emploee.setSpecial("Some special");
        employees.add(emploee);
    }
}
