package HomeWorks.HW2.Classes;

public class PensionerClient extends Actor{

    private int pensId;

    /**
     *
     * @param name Client name
     * @param pensId Pensioner id
     */
    public PensionerClient(String name, int pensId) {
        super(name + " pensioner");
        this.pensId = pensId;
    }

    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
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
    public PensionerClient getActor() {
        return this;
    }

    @Override
    public String getName() {
        return name;
    }
}
