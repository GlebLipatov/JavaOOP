package HomeWorks.HW6.Task2;

public class Car extends Vehicle {
    private static double coefficientAllowedSpeed;

    static {
        coefficientAllowedSpeed = 0.8;
    }

    public Car(int maxSpeed) {
        super(maxSpeed);
    }
}
