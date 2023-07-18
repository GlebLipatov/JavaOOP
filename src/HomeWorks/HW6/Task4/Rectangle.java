package HomeWorks.HW6.Task4;

public class Rectangle extends Square {
    private int height;

    @Override
    public int area() {
        return super.getWidth() * this.height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
