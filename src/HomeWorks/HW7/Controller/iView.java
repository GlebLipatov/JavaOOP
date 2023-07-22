package HomeWorks.HW7.Controller;

import HomeWorks.HW7.Model.CalculatorComplexDecorator;

import java.util.logging.Logger;

public interface iView {
    /**
     *
     * Выбор калькулятора.
     *
     * @return номер, выбранный пользователем.
     */
    int chooseCalculator();

    /**
     *
     * Получает данные, валидирует и отдает оператор от пользователя
     *
     * @param calculator текущий калькулятор.
     * @return оператор выражения.
     */
    Character getExpression(iCalculable calculator);

    /**
     *
     * Результат выражения.
     *
     * @param result Результат строкой.
     */
    void showResult(String result);

    /**
     *
     * Выход из приложения.
     *
     * @return
     */
    boolean quit();
}
