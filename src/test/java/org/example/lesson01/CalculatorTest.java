package org.example.lesson01;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    public void checkSumOfPositiveNumbers() {
        int result = calculator.sum(1, 2);
        assertEquals(3, result);
    }
    @Test
    public void checkSumOfNegativeNumbers() {
        int result = calculator.sum(-1, -2);
        assertEquals(-3, result);
    }
    @Test
    public void checkSumOfOneNullNumber() {
        int result = calculator.sum(null, 2);
        assertEquals(2, result);
    }
    @Test
    public void checkSumtOfTwoNullNumbers() {
        int result = calculator.sum(null, null);
        assertEquals(0, result);
    }
    @Test
    public void checkSumtOfTwoNullNumbers1() {
        int result = calculator.sum(Integer.MAX_VALUE, 100);
        assertEquals(1, result);
        //-2147483648
    }





    @Test
    public void checkProductOfTwoPositiveNumbers() {
        int result = calculator.multiple(2, 2);
        assertEquals(4, result);
    }
    @Test
    public void checkProductOfTwoNegativeNumbers() {
        int result = calculator.multiple(-2, -2);
        assertEquals(4, result);
    }
    @Test
    public void checkProductOfOneNegativeNumbers() {
        int result = calculator.multiple(-2, 2);
        assertEquals(-4, result);
    }
    @Test
    public void checkProductOfOneNumberIsZero() {
        int result = calculator.multiple(0, 2);
        assertEquals(0, result);
    }
    @Test
    public void checkProductOfTwoNumbersAreZero() {
        int result = calculator.multiple(0, 0);
        assertEquals(0, result);
    }
    @Test
    public void checkProductOfOneNumberIsNull() {
        int result = calculator.multiple(null, 1);
        assertEquals(1, result);
    }




//    @Test
//    public void checkQuotientOfTwoPositiveNumbers() {
//        int result = calculator.divide(10, 2);
//        assertEquals(5, result);
//    }
//    @Test
//    public void checkQuotientOfTwoNegativeNumbers() {
//        int result = calculator.divide(-10, -2);
//        assertEquals(5, result);
//    }
//    @Test
//    public void checkQuotientOfOneNegativeNumbers() {
//        int result = calculator.divide(-10, 2);
//        assertEquals(-5, result);
//    }
//    //How to return "undefined" instead "0" in Calculator class?
//    //We can not divide zero and can not divide by zero.
//    @Test
//    public void checkQuotientOfOneNumberIsZero() {
//        int result = calculator.divide(0, -2);
//        assertEquals(0, result);
//    }
    @Test
    public void checkQuotientOfTwoNumbersAreZero() {
        String result = calculator.divide(1, 0);
        assertEquals("undefined", result);
    }

}
