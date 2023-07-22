package HomeWorks.HW7.Model;

import HomeWorks.HW7.Controller.iCalculable;

import java.util.logging.Logger;

public class CalculatorComplex extends CalculatorModel {

    private final int A = 0; // Выражение один, действительное число
    private final int B = 1; // Выражение один, мнимое число
    private final int C = 2; // Выражение два, действительное число
    private final int D = 3; // Выражение два, мнимое число

    private int[] numbers;
    private String result;
    private StringBuilder stringBuilder;

    public CalculatorComplex() {
        this.numbers = new int[4];
        this.stringBuilder = new StringBuilder();
    }

    @Override
    public iCalculable sum() {
        stringBuilder.append(numbers[A] + numbers[C]);
        stringBuilder.append("+");
        stringBuilder.append(numbers[B] + numbers[D]);
        stringBuilder.append("i");
        result = stringBuilder.toString();

        return this;
    }

    @Override
    public iCalculable multi() {
        stringBuilder.append(numbers[A] * numbers[C] - numbers[B] * numbers[D]);
        stringBuilder.append("+");
        stringBuilder.append(numbers[B] * numbers[C] + numbers[A] * numbers[D]);
        stringBuilder.append("i");
        result = stringBuilder.toString();

        return this;
    }

    @Override
    public iCalculable div() {
        stringBuilder.append((numbers[A] * numbers[C] + numbers[B] * numbers[D]) /
                             (numbers[C] * numbers[C] + numbers[D] * numbers[D]));
        stringBuilder.append("+");
        stringBuilder.append((numbers[B] * numbers[C] - numbers[A] * numbers[D]) /
                             (numbers[C] * numbers[C] + numbers[D] * numbers[D]));
        stringBuilder.append("i");
        result = stringBuilder.toString();

        return this;
    }

    @Override
    public iCalculable sub() {
        stringBuilder.append(numbers[A] - numbers[C]);
        stringBuilder.append("+");
        stringBuilder.append(numbers[B] - numbers[D]);
        stringBuilder.append("i");
        result = stringBuilder.toString();

        return this;
    }

    @Override
    public String getResultString() {
        return result;
    }
    @Override
    public int[] getNumbers() {
        return numbers;
    }

    public int getExpressionOneRealNumber() {
        return numbers[A];
    }

    public void setExpressionOneRealNumber(int number) {
        this.numbers[A] = number;
    }

    public int getExpressionOneImaginaryNumber() {
        return numbers[B];
    }

    public void setExpressionOneImaginaryNumber(int number) {
        this.numbers[B] = number;
    }

    public int getExpressionTwoRealNumber() {
        return numbers[C];
    }

    public void setExpressionTowRealNumber(int number) {
        this.numbers[C] = number;
    }

    public int getExpressionTwoImaginaryNumber() {
        return numbers[D];
    }

    public void setExpressionTwoImaginaryNumber(int number) {
        this.numbers[D] = number;
    }


}
