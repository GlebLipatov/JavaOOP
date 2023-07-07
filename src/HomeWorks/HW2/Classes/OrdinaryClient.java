package HomeWorks.HW2.Classes;

public class OrdinaryClient extends Actor {
    /**
     *
     * @param name Client name
     */
    public OrdinaryClient(String name) {
        super(name);
    }

    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    @Override
    public void setTakeOrder(boolean takeOrder) {
        this.isTakeOrder = takeOrder;
    }

    @Override
    public void setMakeOrder(boolean makeOrder) {
        this.isMakeOrder = makeOrder;
    }

    @Override
    public OrdinaryClient getActor() {
        return this;
    }

    @Override
    public String getName() {
        return super.name;
    }
}
