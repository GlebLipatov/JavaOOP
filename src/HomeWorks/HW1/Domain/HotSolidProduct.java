package HomeWorks.HW1.Domain;

import java.math.BigDecimal;
import java.util.Objects;

public class HotSolidProduct extends SolidProduct {
    private int temperature;

    public HotSolidProduct(String brend, String name, BigDecimal price, int weight, int temperature) {
        super(brend, name, price, weight);
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return super.toString() + " temperature:" + this.temperature;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if(!super.equals(o)) return false;

        HotSolidProduct that = (HotSolidProduct) o;

        return super.equals(o) && this.temperature == that.temperature;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), temperature);
    }
}
