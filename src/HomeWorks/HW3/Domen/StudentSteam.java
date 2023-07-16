package HomeWorks.HW3.Domen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentSteam implements Iterable<StudentGroup> {
    private static long id;
    private List<StudentGroup> steam;
    private long idSteam;

    static {
        id = 1;
    }

    public StudentSteam() {
        this.steam= new ArrayList<>();
        this.idSteam = id++;
    }

    public void add(StudentGroup studentGroup) {
        this.steam.add(studentGroup);
    }

    public List<StudentGroup> getSteam() {
        return steam;
    }

    public void setSteam(List<StudentGroup> steam) {
        this.steam = steam;
    }

    public long getIdSteam() {
        return idSteam;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (StudentGroup group : this.steam) {
            sb.append("\t" + group.toString() + "\n");
        }
        return "\nStudentSteam{\n" +
                "\tidSteam=" + idSteam + "\n" +
                "\tsteamSize=" + steam.size() + "\n" +
                sb +
                "}";
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new Iterator<StudentGroup>() {
            private int index;
            @Override
            public boolean hasNext() {
                return index < steam.size();
            }

            @Override
            public StudentGroup next() {
                return steam.get(index++);
            }
        };
    }
}
