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
     */
    public void add(double first, double second) {
        this.result = first + second;
    }

    /**
     * Вычитание
     */
    public void sub(double first, double second) {
        this.result = first - second;
    }

    /**
     * Умножение
     */
    public void mult(double first, double second) {
        this.result = first * second;
    }

    /**
     * Деление
     */
    public void div(double first, double second) {
        this.result = first / second;
    }
}
