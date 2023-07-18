package HomeWorks.HW6.Task2;

public class Vehicle {

    private int maxSpeed;
    private static double coefficientAllowedSpeed;

    public Vehicle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public static double getCoefficientAllowedSpeed() {
        return coefficientAllowedSpeed;
    }

    public static void setCoefficientAllowedSpeed(double coefficientAllowedSpeed) {
        Vehicle.coefficientAllowedSpeed = coefficientAllowedSpeed;
    }

    public int getAllowedSpeed() {
        return (int) (maxSpeed * coefficientAllowedSpeed);
    }
}
