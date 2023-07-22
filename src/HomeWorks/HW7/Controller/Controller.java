package HomeWorks.HW7.Controller;

import HomeWorks.HW7.Model.Calculator;
import HomeWorks.HW7.Model.CalculatorComplex;
import HomeWorks.HW7.Model.CalculatorComplexDecorator;
import HomeWorks.HW7.Model.CalculatorModel;
import HomeWorks.HW7.View.View;

import java.util.logging.ConsoleHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Controller {
    private iCalculable calculator;
    private View view;
    private Logger logger;
    private ConsoleHandler handler;
    private SimpleFormatter foramtter;

    /**
     *
     * Создается экземпляр класса Controller, инициализируется View и Logger.
     *
     */
    public Controller() {
        this.view = new View();

        this.logger = Logger.getLogger(CalculatorComplexDecorator.class.getName());
        this.handler = new ConsoleHandler();
        this.foramtter = new SimpleFormatter();

        logger.addHandler(handler);
        handler.setFormatter(foramtter);
    }

    /**
     *
     * Запускается меню программы.
     *
     */
    public void run() {
        boolean isEnd = false;
        while (!isEnd) {
            // Выбор типа калькулятора (1 - вещественный, 2 - комплексный, 3 - комплексный с логгированием)
            calculator = chooseCalc();

            // Вводим числа и возвращаем действие которе будем выполнять над введенными числами
            Character action = getExpression();

            // Получаем результат в виде строки
            String result = execute(action);

            // Выводим результат в консоль
            view.showResult(result);

            // Продолжаем (n) или заканчиваем вычисления (y)
            isEnd = view.quit();
        }

    }


    /**
     *
     * Выполняется выбранное действие.
     *
     * @param action выбранное действие ('+', '-', '*', '/')
     * @return Результат в формате строки.
     */
    private String execute(Character action) {
        CalculatorModel calc = (CalculatorModel) calculator;
        switch (action) {
            case '+':
                calc.setOperator(action);
                calc.sum();
                break;
            case '-':
                calc.setOperator(action);
                calc.sub();
                break;
            case '*':
                calc.setOperator(action);
                calc.multi();
                break;
            case '/':
                calc.setOperator(action);
                calc.div();
                break;
        }
        return calculator.getResultString();
    }

    /**
     *
     * Вводим параметры для выполнения(первое выражение действительную и мнимую часть, совершаемое действие, второе выражение действительную и мнимую часть).
     *
     * @return Выполняемое действие в виде символа.
     */
    private Character getExpression() {
        return view.getExpression(calculator);
    }

    /**
     *
     * Выбор типа калькулятора (1 - вещественный, 2 - комплексный, 3 - комплексный с логгированием)
     *
     * @return
     */
    private iCalculable chooseCalc() {
        int chooseCalc = view.chooseCalculator();
        if (chooseCalc == 1) {
            return new Calculator();
        } else if (chooseCalc == 2) {
            return new CalculatorComplex();
        }
        return new CalculatorComplexDecorator(logger);
    }
}
