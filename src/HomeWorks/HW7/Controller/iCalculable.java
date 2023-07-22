package HomeWorks.HW7.Controller;

public interface iCalculable {
    /**
     *
     * Сложение.
     *
     * @return
     */
    iCalculable sum();

    /**
     *
     * Умножение.
     *
     * @return
     */
    iCalculable multi();

    /**
     *
     * Деление.
     *
     * @return
     */
    iCalculable div();

    /**
     *
     * Вычитание.
     *
     * @return
     */
    iCalculable sub();
    int[] getNumbers();
    String getResultString();
}
