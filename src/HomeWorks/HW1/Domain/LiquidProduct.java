package HomeWorks.HW1.Domain;

import java.math.BigDecimal;
import java.util.Objects;

public class LiquidProduct extends Product{
    private int volume;

    public LiquidProduct(String brend, String name, BigDecimal price, int volume) {
        super(brend, name, price);
        this.volume = volume;
    }

    @Override
    public String toString() {
        return super.toString() + " volume:" + volume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if(!super.equals(o)) return false;

        LiquidProduct that = (LiquidProduct) o;
        return this.volume == that.volume;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), volume);
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
