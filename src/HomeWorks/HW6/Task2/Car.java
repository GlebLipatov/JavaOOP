package HomeWorks.HW6.Task2;

public class Car extends Vehicle {

    static {
        setCoefficientAllowedSpeed(0.8);
    }

    public Car(int maxSpeed) {
        super(maxSpeed);
    }
}
