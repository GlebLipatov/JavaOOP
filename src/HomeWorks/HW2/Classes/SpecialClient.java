package HomeWorks.HW2.Classes;

public class SpecialClient extends Actor{
    private int idVip;

    public SpecialClient(String name, int idVip) {
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
        super.isTakeOrder = takeOrder;
    }

    @Override
    public void setMakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;
    }

    @Override
    public SpecialClient getActor() {
        return this;
    }

    @Override
    public String getName() {
        return this.name;
    }

    /**
     * REturn vip client id
     * @return vip id
     */
    public int getIdVip(){
        return idVip;
    }
}
