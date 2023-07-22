package com.narendra.testng;

import com.narendra.testng.Calc.Calculator;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestCalculator {

    Calculator calculator;
    int a, b;

    @BeforeMethod
    public void methodBefore(){
        calculator = new Calculator();
        a = 10;
        b = 5;
    }

    @Test(priority = 1)
    public void testAdd(){
        System.out.println("Test Add Function");
        int expected = 15;
        int actual = calculator.add(a, b);
        assertEquals(actual,expected);
    }

    @Test(priority = 2)
    public void testMinus(){
        System.out.println("Test Minus Function");
        int expected = 5;
        int actual = calculator.minus(a, b);
        assertEquals(actual,expected);
    }

    @Test(priority = 3)
    public void testTimes(){
        System.out.println("Test Times Function");
        int expected = 50;
        int actual = calculator.times(a, b);
        assertEquals(actual,expected);
    }

    @Test(priority = 4)
    public void testDivide(){
        System.out.println("Test Divide Function");
        int expected = 2;
        int actual = calculator.divide(a, b);
        assertEquals(actual,expected);
    }
}
