package HomeWorks.HW3.Creator;

import HomeWorks.HW3.StudetDomen.Student;
import HomeWorks.HW3.StudetDomen.StudentGroup;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CreatorGroup {
    private int groupSizeMin;
    private int groupSizeMax;

    /**
     *
     * @param groupSizeMin minimum size of the group
     * @param groupSizeMax maximum size of the group
     */
    public CreatorGroup(int groupSizeMin, int groupSizeMax) {
        this.groupSizeMin = groupSizeMin;
        this.groupSizeMax = groupSizeMax;
    }

    /**
     * Create new group of students that have random size
     * @return new StudentGroup
     */
    public StudentGroup create(){
        Random rnd = new Random();
        CreatorStudent creatorStudent = new CreatorStudent();
        StudentGroup studentGroup = new StudentGroup();

        for (int i = 0; i < rnd.nextInt(groupSizeMin, groupSizeMax + 1); i++) {
            studentGroup.add(creatorStudent.create());
        }
        return studentGroup;
    }
}
