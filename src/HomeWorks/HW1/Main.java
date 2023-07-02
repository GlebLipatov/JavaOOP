package HomeWorks.HW1;

import HomeWorks.HW1.Domain.HotLiquidProduct;
import HomeWorks.HW1.Domain.HotSolidProduct;
import HomeWorks.HW1.Domain.LiquidProduct;
import HomeWorks.HW1.Domain.SolidProduct;
import HomeWorks.HW1.Services.VendingMachine;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine(10, 5);
        // Ассортимент
        vendingMachine.showcase();

        // добавляем новые продукты
        vendingMachine.upload(new SolidProduct("Bread", "Borodinskiy", new BigDecimal(30), 300));
        vendingMachine.upload(new SolidProduct("Lays", "Paprica", new BigDecimal(100), 200));
        vendingMachine.upload(new HotLiquidProduct("StarBucks", "Americano", new BigDecimal(400), 200,90));
        vendingMachine.upload(new HotLiquidProduct("Tea", "Lipton", new BigDecimal(200), 200,90));
        vendingMachine.upload(new HotLiquidProduct("StarBucks", "Americano", new BigDecimal(400), 200,90));
        vendingMachine.upload(new HotSolidProduct("Wife", "Borsch", new BigDecimal(69), 300,80));
        vendingMachine.upload(new LiquidProduct("Kvass", "From Yellow Tank", new BigDecimal(50), 500));

        System.out.println("\n\nПосле загрузки\n\n");

        // Смотрим ассортимент с добавленными продуктами
        vendingMachine.showcase();

        System.out.println("\nПокупаем\n");

        // Покупаем новые продукты, получаем сдачу или не покупаем если денег недостаточно
        vendingMachine.release(1);
        vendingMachine.release(7);
    }

}
