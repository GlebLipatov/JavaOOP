package HomeWorks.HW6.Task1;

import java.util.ArrayList;
import java.util.List;

public class Accounting {
    private List<Employee> employees;
    private int baseSalary;

    public Accounting(int baseSalary) {
        this.employees = new ArrayList<>();
        this.baseSalary = baseSalary;
    }

    public Integer calculateNetSalary(Employee employee, double coefficient) {
        if (employees.contains(employee)) {
            int tax = (int) (baseSalary * coefficient);
            return baseSalary - tax;
        } else {
            // TODO ...
            return null;
        }

    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public boolean add(Employee employee) {
        if (!employees.contains(employee)) {
            employees.add(employee);
            return true;
        }
        return false;

    }

    public boolean remove(Employee employee) {
        if (!employees.contains(employee)) {
            employees.remove(employee);
            return true;
        }
        return false;

    }
}
