package HomeWorks.HW3.Creator;

import HomeWorks.HW3.StudetDomen.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CreatorStudent {
    private List<String> firstNames;
    private List<String> lastNames;

    public CreatorStudent() {
        this.firstNames = new ArrayList<>();
        this.lastNames = new ArrayList<>();
        init();
    }

    private void init(){
        firstNames.add("Иван");
        firstNames.add("Петр");
        firstNames.add("Василий");
        firstNames.add("Александр");

        lastNames.add("Иванов");
        lastNames.add("Петров");
        lastNames.add("Сидоров");
        lastNames.add("Попов");
    }

    /**
     * Create new student that have random first name, last name and age
     * @return new Student
     */
    public Student create(){
        Random rnd = new Random();
        String firstName = firstNames.get(rnd.nextInt(4));
        String lastName = lastNames.get(rnd.nextInt(4));
        int age = rnd.nextInt(18, 30);

        return new Student(firstName, lastName, age);
    }
}
