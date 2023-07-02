package HomeWorks.HW1.Domain;

import java.math.BigDecimal;
import java.util.Objects;

public class Product {
    private static long ID = 0;
    private long id;
    private String brand;
    private String name;
    private BigDecimal price;

    public Product(String brend, String name, BigDecimal price) {
        this.brand = brend;
        this.name = name;
        this.price = price;
        this.id = ++ID;
    }

    @Override
    public String toString() {
        return String.format("id:%d brand:%s name:%s price:%d", id, brand, name, price.toBigInteger());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        return
                this.brand.equals(product.brand) &&
                        this.name.equals(product.name) &&
                        this.price.equals(product.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, brand, name, price);
    }

    public long getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
