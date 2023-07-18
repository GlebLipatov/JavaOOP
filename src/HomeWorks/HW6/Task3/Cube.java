package HomeWorks.HW6.Task3;

public class Cube implements iShape3d {
    private int edge;
    public Cube(int edge) {
        this.edge = edge;
    }
    @Override
    public double volume() {
        return edge * edge * edge;
    }

    @Override
    public double area() {
        return 0;
    }
}
