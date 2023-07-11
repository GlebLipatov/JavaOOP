package HomeWorks.HW3.StudetDomen;

public class Student extends User implements Comparable<Student> {
    private static long id;
    private long idStudent;

    static {
        id = 1;
    }

    public Student(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
        this.idStudent = id++;
    }

    public long getIdStudent() {
        return idStudent;
    }

    @Override
    public String toString() {
        return "User{" +
                "idStudent='"  + this.idStudent + '\'' +
                ", firsName='" + super.getFirstName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                ", age=" + super.getAge() +
                '}';
    }

    @Override
    public int compareTo(Student that) {
        if (this.getAge() == that.getAge()) return 0;
        else if (this.getAge() > that.getAge()) return 1;
        else return -1;
    }
}
