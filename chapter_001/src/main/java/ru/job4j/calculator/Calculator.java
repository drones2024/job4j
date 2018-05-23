package ru.job4j.calculator;
/**
 * Калькулятор
 */
public class Calculator {
    private double result;

    /**
     * Получение результата
     */
    public double getResult() {
        return this.result;
    }

    /**
     * Сложение
     * param first число
     * param second число
     */
    public void add(double first, double second) {
        this.result = first + second;
    }

    /**
     * Вычитание
     * param first число
     * param second число
     */
    public void sub(double first, double second) {
        this.result = first - second;
    }

    /**
     * Умножение
     * param first число
     * param second число
     */
    public void mult(double first, double second) {
        this.result = first * second;
    }

    /**
     * Деление
     * param first число
     * param second число
     */
    public void div(double first, double second) {
        this.result = first / second;
    }
}
