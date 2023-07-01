package HomeWorks.HW1.Domain;

import java.math.BigDecimal;
import java.util.Objects;

public class HotLiquidProduct extends LiquidProduct {
    private int temperature;

    public HotLiquidProduct(String brend, String name, BigDecimal price, int volume, int temperature) {
        super(brend, name, price, volume);
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

        HotLiquidProduct that = (HotLiquidProduct) o;
        return super.equals(o) && this.temperature == that.temperature;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), temperature);
    }

    @Override
    public int getVolume() {
        return super.getVolume();
    }

    @Override
    public void setVolume(int volume) {
        super.setVolume(volume);
    }
}
