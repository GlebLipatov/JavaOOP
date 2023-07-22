package HomeWorks.HW7.View;

import HomeWorks.HW7.Controller.iCalculable;
import HomeWorks.HW7.Controller.iView;
import HomeWorks.HW7.Model.CalculatorComplexDecorator;

import java.util.Scanner;
import java.util.logging.Logger;

public class View implements iView {
    private Scanner inputFromUser;

    public View() {
        this.inputFromUser = new Scanner(System.in);
    }

    @Override
    public int chooseCalculator() {
        System.out.println("1 - Вещественных чисел\n2 - Комплексных чисел\n3 - Комплексных чисел(С Логгированием)");
        while (true) {
            System.out.print("Выберете калькулятор: ");
            String in = inputFromUser.nextLine();
            if (in.equals("1") || in.equals("2") || in.equals("3")) {
                return Integer.parseInt(in);
            }
        }
    }

    @Override
    public Character getExpression(iCalculable calculator) {
        Character action = null;
        boolean isIvnalid = true;
        /*

         * Проходим по массиву, который будет хранить операндов выражений
         * На каждой итерации проводится валидация полученных данных от пользователя
         * на итерации i == calculator.getNumbers().length / 2 вводится оператор

         */
        for (int i = 0; i < calculator.getNumbers().length; i++) {
            if (i == calculator.getNumbers().length / 2) {
                isIvnalid = true;
                while (isIvnalid) {
                    System.out.print("Какое действие будем выполнять?: ");
                    String in = inputFromUser.nextLine();
                    if (in.equals("+") || in.equals("-") || in.equals("*") || in.equals("/")) {
                        action = in.charAt(0);
                        isIvnalid = false;
                    }
                }
            }

            isIvnalid = true;
            while (isIvnalid) {
                isIvnalid = false;
                System.out.print("Введите " + (i + 1) + " число: ");
                String in = inputFromUser.nextLine();

                for (char c : in.toCharArray()) {
                    if (Character.isAlphabetic(c)) {
                        isIvnalid = true;
                        break;
                    }
                }

                if (!isIvnalid) {
                    calculator.getNumbers()[i] = Integer.parseInt(in);
                }
            }

        }
        return action;
    }

    @Override
    public void showResult(String result) {
        System.out.println("Результат вычислений: " + result);
    }

    @Override
    public boolean quit() {
        System.out.print("Закончить (y/n): ");
        return inputFromUser.nextLine().equals("y") ? true : false;
    }
}
