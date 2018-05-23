package ru.obj4j.calculator;

import ru.job4j.calculator.Calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CalculatorTest {
    /**
     * Сложение
     */
    @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(10,10);
        double result = calc.getResult();
        double expected = 20;
        assertThat(result, is(expected));
    }

    /**
     * Вычитание
     */
    @Test
    public void whenSub2On10Then10() {
        Calculator calc = new Calculator();
        calc.sub(20,10);
        double result = calc.getResult();
        double expected = 10;
        assertThat(result, is(expected));
    }

    /**
     * Умножение
     */
    @Test
    public void whenMult10On10Then100() {
        Calculator calc = new Calculator();
        calc.mult(10,10);
        double result = calc.getResult();
        double expected = 100;
        assertThat(result, is(expected));
    }

    /**
     * Деление
     */
    @Test
    public void whenDiv10n10Then1() {
        Calculator calc = new Calculator();
        calc.div(10,10);
        double result = calc.getResult();
        double expected = 1;
        assertThat(result, is(expected));
    }

}
