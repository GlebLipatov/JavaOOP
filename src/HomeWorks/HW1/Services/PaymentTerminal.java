package HomeWorks.HW1.Services;

import java.math.BigDecimal;
import java.util.Scanner;

public class PaymentTerminal {
    /**
     * Accept purchase
     *
     * @param price current product
     * @return
     */
    public boolean acceptOrder(BigDecimal price) {
        BigDecimal depositedMoney = getMoneyFromClient(price);
        return hasPaid(price, depositedMoney);
    }

    /**
     * Take money from client
     *
     * @param price current product
     * @return money
     */
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

    /**
     * Accept paid
     *
     * @param price          current product
     * @param depositedMoney entered money
     * @return true if money entered and false if not or not enough
     */
    private boolean hasPaid(BigDecimal price, BigDecimal depositedMoney) {
        if (price.equals(depositedMoney)) {
            return true;
        } else if (price.max(depositedMoney).equals(depositedMoney)) {
            giveChange(depositedMoney.subtract(price));
            return true;
        }
        return false;
    }

    /**
     * Give change if money to much
     *
     * @param change money
     */
    private void giveChange(BigDecimal change) {
        System.out.println("Your change: " + change.toString());
    }
}
