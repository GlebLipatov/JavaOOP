package HomeWorks.HW1.Services;

import HomeWorks.HW1.Domain.LiquidProduct;
import HomeWorks.HW1.Domain.Product;
import HomeWorks.HW1.Domain.SolidProduct;

import javax.swing.*;
import java.math.BigDecimal;

public class VendingMachine {
    private Holder holder;
    private PaymentTerminal paymentTerminal;

    /**
     * Constructor
     *
     * @param quantityCellsInHolder set the quantity cells with different products in the vending machine
     * @param cellSize              size of the any cell
     */
    public VendingMachine(int quantityCellsInHolder, int cellSize) {
        this.holder = new Holder(quantityCellsInHolder, cellSize);
        this.paymentTerminal = new PaymentTerminal();

        this.holder.addProduct(new LiquidProduct("CocaCola", "Classic", new BigDecimal(50), 330));
        this.holder.addProduct(new LiquidProduct("CocaCola", "Classic", new BigDecimal(50), 330));
        this.holder.addProduct(new LiquidProduct("Aqua Minerale", "Carbonated", new BigDecimal(60), 500));
        this.holder.addProduct(new LiquidProduct("Aqua Minerale", "Still", new BigDecimal(50), 500));
        this.holder.addProduct(new SolidProduct("Lays", "Paprica", new BigDecimal(100), 200));

    }

    /**
     * Choice current product and info about them
     *
     * @param position in the vending machine
     * @return Info about current product
     */
    public String choiceProduct(int position) {
        return this.holder.getProductInfo(position);
    }

    /**
     * Buying current product
     *
     * @param position in the vending machine
     * @return true if purchase is done and false if not
     */
    public boolean release(int position) {
        BigDecimal price = holder.getPrice(position);
        String brand = holder.getBrand(position);
        String name = holder.getName(position);
        System.out.println("Brand: " + brand + " name: " + name + "\nFor payment: " + price.toString() + "p");
        if (pay(price)) {
            System.out.println("Thanks and bye");
            return this.holder.getProduct(position);
        }
        System.out.println("No money, no funny");
        return false;
    }

    /**
     * Payment
     *
     * @param price ceurrent product
     * @return true if purchase is done and false if not
     */
    public boolean pay(BigDecimal price) {
        return paymentTerminal.acceptOrder(price);
    }

    /**
     * Upload new products
     *
     * @param product new product
     */
    public void upload(Product product) {
        holder.addProduct(product);
    }

    /**
     * Print showcase
     */
    public void showcase() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Slot:" + (i + 1) + " " + holder.getProductInfo(i));
        }
    }
}
