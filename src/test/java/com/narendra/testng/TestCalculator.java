package com.narendra.testng;

import com.narendra.testng.Calc.Calculator;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestCalculator {

    @Test
    public void testAdd(){
        System.out.println("Test Add Function");
        Calculator calculator = new Calculator();
        int expected = 15;
        int actual = calculator.add(10,5);
        assertEquals(actual,expected);
    }
}
