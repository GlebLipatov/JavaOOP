package Seminar.VendingMachine.Factory.Rewards;

public class GemGen extends ItemGen {
    @Override
    public iGameItem createItem() {
        return new Gem();
    }
}
