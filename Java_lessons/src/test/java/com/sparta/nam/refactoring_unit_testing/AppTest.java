package com.sparta.nam.refactoring_unit_testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AppTest {

//    @Test
//    @DisplayName("First Test")
//    public void firstTest(){
//        Assertions.assertTrue(false);
//    }


    @Test
    @DisplayName("getGreeting, when given a time of 21, returns good evening")
    public void getGreeting_giveATimeOf21_ReturnsGoodEvening(){
        //  Arrange (given)
        int time = 21;
        String expected = "Good evening!";
        // Act (when)
        String actual = App.getGreeting(time);
        // Assert (then)
        Assertions.assertEquals(expected, actual);

        // Assertions.assertEquals("Good evening!", App.getGreeting(time));

    }


    @Test
    @DisplayName("getGreeting, when given a time of 12, returns Good Afternoon")
    public void getGreeting_giveATimeOf12_ReturnsSomething(){
        int time = 12;
        String expected = "Good afternoon!";
        String actual = App.getGreeting(time);
        Assertions.assertEquals(expected, actual);
    }
}
