package Seminar.VendingMachine.Factory.Rewards;

public class Gold implements iGameItem {
    @Override
    public void open() {
        System.out.println("Gold");
    }
}
