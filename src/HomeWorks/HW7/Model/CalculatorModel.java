package HomeWorks.HW7.Model;

import HomeWorks.HW7.Controller.iCalculable;

public abstract class CalculatorModel implements iCalculable {
    private int[] numbers;
    private String result;
    private Character operator;

    @Override
    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Character getOperator() {
        return operator;
    }

    public void setOperator(Character operator) {
        this.operator = operator;
    }
}
