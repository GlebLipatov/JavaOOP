package HomeWorks.HW3.Domen;

public class Teacher extends Person {
    private static long id;
    private long idTeacher;
    private String acadDegree;

    static {
        id = 1;
    }

    public Teacher(String firstName, String lastName, int age, String acadDegree) {
        super(firstName, lastName, age);
        this.acadDegree = acadDegree;
        this.idTeacher = id++;
    }

    public Teacher(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
        this.idTeacher = id++;
    }

    public String getAcadDegree() {
        return acadDegree;
    }

    public void setAcadDegree(String acadDegree) {
        this.acadDegree = acadDegree;
    }

    @Override
    public String toString() {
        return "User{" +
                "idTeacher='"  + this.idTeacher + '\'' +
                ", acadDegree='"  + this.acadDegree + '\'' +
                ", firsName='" + super.getFirstName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                ", age=" + super.getAge() +
                '}';
    }
}
