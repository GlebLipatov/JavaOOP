package HomeWorks.HW3.Controllers;

import HomeWorks.HW3.Domen.Emploee;
import HomeWorks.HW3.Domen.Teacher;
import HomeWorks.HW3.Services.EmploeeService;

public class EmploeeController implements iPersonController<Emploee> {
    private final EmploeeService dataService = new EmploeeService();
    @Override
    public void create(String firstName, String lastName, int age) {
        dataService.create(firstName, lastName, age);
    }

    public <T extends Emploee> void paySalary(T emploee) {
        System.out.println("Pay some salary");
    }

    public EmploeeService getDataService() {
        return dataService;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        for (Emploee teacher : dataService.getAll()) {
            stringBuilder.append(teacher.toString() + "\n");
        }
        return stringBuilder.toString();
    }
}
