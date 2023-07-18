package HomeWorks.HW6.Task2;

public class Bus extends Vehicle {

    static {
        setCoefficientAllowedSpeed(0.6);
    }

    public Bus(int maxSpeed) {
        super(maxSpeed);
    }
}
