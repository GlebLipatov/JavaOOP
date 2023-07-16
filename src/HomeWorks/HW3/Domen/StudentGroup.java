package HomeWorks.HW3.Domen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup> {
    private static long id;
    private List<Student> group;
    private long idGroup;

    static {
        id = 1;
    }
    public StudentGroup() {
        this.group = new ArrayList<>();
        this.idGroup = id++;
    }

    public static long getId() {
        return id;
    }

    public List<Student> getGroup() {
        return group;
    }

    public void setGroup(List<Student> group) {
        this.group = group;
    }

    public long getIdGroup() {
        return idGroup;
    }

    public void add(Student student) {
        this.group.add(student);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        for (Student student : group) {
            sb.append("\t\t" + student.toString() + "\n");
        }
        return "\n\tStudentGroup{\n" +
                "\t\tidGroup=" + idGroup + "\n" +
                "\t\tgroupSize=" + group.size() + "\n" +
                sb +
                "\t}";
    }

    @Override
    public Iterator<Student> iterator() {
        return new Iterator<Student>() {

            private int index;
            @Override
            public boolean hasNext() {
                return index < group.size();
            }

            @Override
            public Student next() {
                return group.get(index++);
            }
        };
    }

    @Override
    public int compareTo(StudentGroup that) {
        if (this.getGroup().size() == that.getGroup().size()) {
            if (this.getIdGroup() == that.getIdGroup()) return 0;
            else if (this.getIdGroup() > that.getIdGroup()) return 1;
            else return -1;
        }
        else if (this.getGroup().size() > that.getGroup().size()) return 1;
        else return -1;
    }
}
