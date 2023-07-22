package com.narendra.testng;

import org.testng.annotations.*;

public class ExecProcedure {

    @BeforeClass
    public static void methodBeforeClass(){
        System.out.println("Method Before Class");
    }
    @BeforeMethod
    public static void methodBefore(){
        System.out.println("Method Before");
    }
    @Test
    public static void methodTestOne(){
        System.out.println("Method Test 1 ");
    }

    @Test
    public static void methodTestTwo(){
        System.out.println("Method Test 2 ");
    }
    @AfterMethod
    public static void methodAfter(){
        System.out.println("Method After");
    }
    @AfterClass
    public static void methodAfterClass(){
        System.out.println("Method After Class");
    }
}
