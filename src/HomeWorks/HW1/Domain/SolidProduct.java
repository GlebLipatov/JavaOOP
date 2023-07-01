package HomeWorks.HW1.Domain;

import java.math.BigDecimal;
import java.util.Objects;

public class SolidProduct extends Product {
    private int weight;

    public SolidProduct(String brend, String name, BigDecimal price, int weight) {
        super(brend, name, price);
        this.weight = weight;
    }

    @Override
    public String toString() {
        return super.toString() + " weight:" + weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        SolidProduct that = (SolidProduct) o;
        return weight == that.weight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), weight);
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
