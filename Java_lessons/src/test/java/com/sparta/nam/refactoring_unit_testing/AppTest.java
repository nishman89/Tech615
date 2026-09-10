package com.sparta.nam.refactoring_unit_testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

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

    @Test
    @DisplayName("getGreeting, when given a time of 8, returns good morning")
    public void getGreeting_GivenATimeOf8_ReturnsGoodMorning()
    {
        Assertions.assertEquals("Good morning!", App.getGreeting(8));
    }

    @Test
    @DisplayName("getGreeting, when given a time of 15, returns good afternoon")
    public void getGreeting_GivenATimeOf15_ReturnsGoodAfternoon()
    {
        Assertions.assertEquals("Good afternoon!", App.getGreeting(15));
    }

    @Test
    @DisplayName("getGreeting, when given a time of 2, returns good evening")
    public void getGreeting_GivenATimeOf2_ReturnsGoodEvening()
    {
        Assertions.assertEquals("Good evening!", App.getGreeting(2));
    }


    // Paramterized tests
    @ParameterizedTest
    @ValueSource(ints = {5,11})
    @DisplayName("getGreeing, when given a time from 5 to 11, returns good morning")
    public void getGreeting_givenTimeBetween5and11_returnsGoodMorning(int time){
        Assertions.assertEquals("Good morning!", App.getGreeting(time));
    }

    //  2 -> "Good evening!"
    //  8 -> "Good morning!"
    //  15 -> "Good afternoon!"
    //  21 -> "Good evening!"
    @ParameterizedTest
    @CsvSource({

            //Greeting, Time
        "Good evening!, 2",
        "Good morning!, 8",
        "Good afternoon!, 15",
        "Good evening!, 21",
    })
    @DisplayName("getGreeting, when given a time, returns an appropriate greeting")
    public void givenATime_Greeting_returnsAnAppropriateGreeting(String greeting, int time){
        Assertions.assertEquals(greeting, App.getGreeting(time));
    }

}
