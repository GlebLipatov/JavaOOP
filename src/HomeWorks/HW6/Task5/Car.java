package HomeWorks.HW6.Task5;

public class Car {
    private Startable engine;
    public Car(Startable engine) {
        this.engine = engine;
    }
    public void start() {
        this.engine.start();
    }
}
