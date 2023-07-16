package HomeWorks.HW3.Services;

import HomeWorks.HW3.Domen.Person;

import java.util.List;

public class AveregeAge<T extends Person> {

    public int averageAge(List<T> persons){
        int sumAge = 0;

        for (var person : persons) {
            sumAge += person.getAge();
        }

        return sumAge / persons.size();
    }
}
