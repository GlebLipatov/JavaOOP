package HomeWorks.HW2.Classes;

import HomeWorks.HW2.Interfaces.iActorBehaviuor;

public abstract class Actor implements iActorBehaviuor {
    protected String name;
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;

    public Actor(String name) {
        this.name = name;
    }

    /**
     * Return the name of the actor
     * @return name
     */
    public abstract String getName();
}