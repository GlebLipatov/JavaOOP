package HomeWorks.HW3.Creator;

import HomeWorks.HW3.StudetDomen.StudentGroup;
import HomeWorks.HW3.StudetDomen.StudentSteam;

import java.util.Iterator;
import java.util.Random;

public class CreatorSteam {
    private int groupSizeMin;
    private int groupSizeMax;
    private int steamSizeMin;
    private int steamSizeMax;

    /**
     *
     * @param groupSizeMin minimum size of the group
     * @param groupSizeMax maximum size of the group
     * @param steamSizeMin minimum size of the steam
     * @param steamSizeMax maximum size of the steam
     */
    public CreatorSteam(int groupSizeMin, int groupSizeMax, int steamSizeMin, int steamSizeMax) {
        this.groupSizeMin = groupSizeMin;
        this.groupSizeMax = groupSizeMax;
        this.steamSizeMin = steamSizeMin;
        this.steamSizeMax = steamSizeMax;
    }

    /**
     * Create new steam that have random size.
     * @return new StudentSteam
     */
    public StudentSteam create() {
        Random rnd = new Random();
        CreatorGroup creatorGroup = new CreatorGroup(groupSizeMin, groupSizeMax);
        StudentSteam studentSteam = new StudentSteam();

        for (int i = 0; i < rnd.nextInt(steamSizeMin, steamSizeMax + 1); i++) {
            studentSteam.add(creatorGroup.create());
        }

        return studentSteam;
    }
}
