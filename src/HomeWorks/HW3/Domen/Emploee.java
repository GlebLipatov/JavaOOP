package HomeWorks.HW3.Domen;

public class Emploee extends Person {
    private static long id;
    private long idEmploee;
    private String special;

    static {
        id = 1;
    }

    public Emploee(String firstName, String lastName, int age, String special) {
        super(firstName, lastName, age);
        this.special = special;
        this.idEmploee = id++;
    }

    public Emploee(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }

    public String getSpecial() {
        return special;
    }

    public void setSpecial(String special) {
        this.special = special;
    }

    public static long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "User{" +
                "special='"  + this.special + '\'' +
                ", firsName='" + super.getFirstName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                ", age=" + super.getAge() +
                '}';
    }
}
