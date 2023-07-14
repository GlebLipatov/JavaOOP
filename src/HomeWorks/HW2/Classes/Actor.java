package HomeWorks.HW2.Classes;

public abstract class Actor {
    protected String name;
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;

    public Actor(String name) {
        this.name = name;
    }

    abstract public String getName();
}
