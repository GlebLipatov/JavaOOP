package HomeWorks.HW3.Controllers;

import HomeWorks.HW3.Domen.Person;

public interface iPersonController<T extends Person> {
    void create(String firstName, String lastName, int age);
}
