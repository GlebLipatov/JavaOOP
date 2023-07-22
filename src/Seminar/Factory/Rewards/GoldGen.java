package Seminar.VendingMachine.Factory.Rewards;

public class GoldGen extends ItemGen {
    @Override
    public iGameItem createItem() {
        return new Gold();
    }
}
