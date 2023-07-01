package HomeWorks.HW1.Services;

import java.math.BigDecimal;
import java.util.Scanner;

public class PaymentTerminal {
    public boolean acceptOrder(BigDecimal price) {
        BigDecimal depositedMoney = getMoneyFromClient(price);
        return hasPaid(price, depositedMoney);
    }

    private BigDecimal getMoneyFromClient(BigDecimal price) {
        Scanner scanner = new Scanner(System.in);
        String insert;
        boolean isDigit;
        do {
            isDigit = true;
            System.out.print("Terminal: Insert " + price.toString() + "p: ");
            insert = scanner.nextLine();

            for (char letter : insert.toCharArray()) {
                if (!Character.isDigit(letter)) {
                    isDigit = false;
                    break;
                }
            }
        } while (!isDigit);
        return new BigDecimal(Integer.parseInt(insert));
    }

    private boolean hasPaid(BigDecimal price, BigDecimal depositedMoney) {
        if (price.equals(depositedMoney)) {
            return true;
        } else if (price.max(depositedMoney) == depositedMoney) {
            giveChange(depositedMoney.subtract(price));
            return true;
        } else  {
            return false;
        }
    }

    private void giveChange(BigDecimal change) {
        System.out.println("Your change: " + change.toString());
    }
}
