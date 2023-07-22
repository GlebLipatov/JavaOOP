package HomeWorks.HW7.Model;

import HomeWorks.HW7.Controller.iCalculable;

import java.util.logging.Logger;

public class CalculatorComplexDecorator extends CalculatorModel {

    private final int A = 0; // Выражение один, действительное число
    private final int B = 1; // Выражение один, мнимое число
    private final int C = 2; // Выражение два, действительное число
    private final int D = 3; // Выражение два, мнимое число

    private int[] numbers;
    private String result;
    private StringBuilder stringBuilder;
    private Logger logger;

    public CalculatorComplexDecorator(Logger logger) {
        this.numbers = new int[4];
        this.stringBuilder = new StringBuilder();
        this.logger = logger;
    }

    @Override
    public iCalculable sum() {
        stringBuilder.append(numbers[A] + numbers[C]);
        stringBuilder.append("+");
        stringBuilder.append(numbers[B] + numbers[D]);
        stringBuilder.append("i");
        result = stringBuilder.toString();

        logging();
        return this;
    }

    @Override
    public iCalculable multi() {
        stringBuilder.append(numbers[A] * numbers[C] - numbers[B] * numbers[D]);
        stringBuilder.append("+");
        stringBuilder.append(numbers[B] * numbers[C] + numbers[A] * numbers[D]);
        stringBuilder.append("i");
        result = stringBuilder.toString();

        logging();
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

        logging();
        return this;
    }

    @Override
    public iCalculable sub() {
        stringBuilder.append(numbers[A] - numbers[C]);
        stringBuilder.append("+");
        stringBuilder.append(numbers[B] - numbers[D]);
        stringBuilder.append("i");
        result = stringBuilder.toString();

        logging();
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

    /**
     *
     * Вывод лога.
     *
     */
    private void logging() {
        String message = String.format("\nПервое выражение действительная часть=%d" +
                        "\nПервое выражение мнимая часть=%di" +
                        "\nВторое выражение действительная часть=%d" +
                        "\nВторое выражение мнимая часть=%di" +
                        "\nДействие=%s" +
                        "\nРезультат=%s",
                getExpressionOneRealOperand(),
                getExpressionOneImaginaryOperand(),
                getExpressionTwoRealOperand(),
                getExpressionTwoImaginaryOperand(),
                getOperator(),
                getResultString());

        logger.info(message);
    }

    public int getExpressionOneRealOperand() {
        return numbers[A];
    }

    public void setExpressionOneRealNumber(int number) {
        this.numbers[A] = number;
    }

    public int getExpressionOneImaginaryOperand() {
        return numbers[B];
    }

    public void setExpressionOneImaginaryNumber(int number) {
        this.numbers[B] = number;
    }

    public int getExpressionTwoRealOperand() {
        return numbers[C];
    }

    public void setExpressionTowRealNumber(int number) {
        this.numbers[C] = number;
    }

    public int getExpressionTwoImaginaryOperand() {
        return numbers[D];
    }

    public void setExpressionTwoImaginaryNumber(int number) {
        this.numbers[D] = number;
    }
}
