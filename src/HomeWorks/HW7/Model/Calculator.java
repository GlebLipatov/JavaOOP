package HomeWorks.HW7.Model;

import HomeWorks.HW7.Controller.iCalculable;

public class Calculator extends CalculatorModel {
    private final int A = 0; // Первое число
    private final int B = 1; // Второе число
    private int[] numbers;
    private String result;

    public Calculator() {
        this.numbers = new int[2];
    }

    public Calculator(int[] numbers) {
        this.numbers = new int[2];
        this.numbers[A] = numbers[A];
        this.numbers[B] = numbers[B];
    }

    @Override
    public iCalculable sum() {
        Integer res = numbers[A] + numbers[B];
        result = res.toString();
        return this;
    }

    @Override
    public iCalculable multi() {
        Integer res = numbers[A] * numbers[B];
        result = res.toString();
        return this;
    }

    @Override
    public iCalculable div() {
        Integer res =numbers[A] / numbers[B];
                result = res.toString();
        return null;
    }

    @Override
    public iCalculable sub() {
        Integer res = numbers[A] - numbers[B];
        result = res.toString();
        return null;
    }

    @Override
    public String getResultString() {
        return result;
    }

    @Override
    public int[] getNumbers() {
        return numbers;
    }

    public Double getResultDouble() {
        return Double.parseDouble(result);
    }

    public int getNumberFirst() {
        return numbers[A];
    }

    public void setNumberFirst(int numberFirst) {
        this.numbers[A] = numberFirst;
    }

    public int getNumberSecond() {
        return numbers[B];
    }

    public void setNumberSecond(int numberSecond) {
        this.numbers[B] = numberSecond;
    }
}
