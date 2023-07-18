package HomeWorks.HW6.Task2;

public class Bus extends Vehicle {
    private static double coefficientAllowedSpeed;

    static {
        coefficientAllowedSpeed = 0.6;
    }

    public Bus(int maxSpeed) {
        super(maxSpeed);
    }
}
