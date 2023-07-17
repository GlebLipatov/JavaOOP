package HomeWorks.HW5.Model;

public class Student extends Person implements Comparable<Student> {
    private static long id;
    private long idStudent;

    static {
        id = 1;
    }

    public Student(String name, int age) {
        super(name, age);
        this.idStudent = id++;
    }

    public long getIdStudent() {
        return idStudent;
    }

    @Override
    public String toString() {
        return "User{" +
                "idStudent='"  + this.idStudent + '\'' +
                ", name='" + super.getName() + '\'' +
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
