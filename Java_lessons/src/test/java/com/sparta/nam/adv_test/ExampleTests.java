package com.sparta.nam.adv_test;

import org.junit.jupiter.api.*;

public class ExampleTests {


    private static int num1;
    private static int num2;

//    @BeforeAll
//    public static void setUp(){
//        num1 = 2;
//        num2 = 4;
//    }

    @Test
    @Order(2)
    public void testOne(){
        System.out.println("testOne");
    }

    @Test
    @Order(1)
    public void testTwo(){
        System.out.println("testTwo");
    }

//    @AfterEach
//    public void cleanUp(){
//        System.out.println("After Each");
//    }
//
//    @AfterAll
//    public static void tearDown(){
//        System.out.println("After All");
//    }
}
