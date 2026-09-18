package com.sparta.nam.adv_test;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.Matchers.*;

public class CalculatorTests {

    @Test
    void given2And6_Add_Returns8Pt0() {
        Calculator calc = new Calculator(6, 2);
        Assertions.assertEquals(8.0, calc.add());
        MatcherAssert.assertThat(calc.add(), is(8.0));
        MatcherAssert.assertThat(calc.add(), equalTo(8.0));
    }

    @Test
    void given6And3_DivisibleBy_ReturnsTrue() {
        Calculator calc = new Calculator(6, 2);
        Assertions.assertTrue(calc.divisibleBy());
        Assertions.assertTrue(calc.divisibleBy());
        MatcherAssert.assertThat(calc.divisibleBy(), is(true));
    }

    @Test
    void given7And3_DivisibleBy_ReturnsFalse() {
        Calculator calc = new Calculator(7, 3);
        Assertions.assertFalse(calc.divisibleBy());
        Assertions.assertFalse(calc.divisibleBy());
        MatcherAssert.assertThat(calc.divisibleBy(), is(false));
    }

    @Test
    void given7And3_ToString_OutputContainsCalculator() {
        Calculator calc = new Calculator(7, 3);
        Assertions.assertTrue(calc.toString().contains("Calculator"));
        Assertions.assertTrue(calc.toString().contains("Calculator"));
        MatcherAssert.assertThat(calc.toString(), containsString("Calculator"));
    }

    @Test
    void moreStringMatchers(){
        var testString = "Oh Sally can wait, she's knows it too late.";
        MatcherAssert.assertThat(testString, startsWith("Oh"));
        MatcherAssert.assertThat(testString, endsWith("late."));
        MatcherAssert.assertThat(testString, containsStringIgnoringCase("latE."));
        MatcherAssert.assertThat(testString, stringContainsInOrder("Oh", "wait", "she"));
    }

    @Test
    void collectionMatchersExercise(){
        List<String> fruit = List.of("apple", "pear", "peach","pomegranate","pineapple","lemon");
        MatcherAssert.assertThat(fruit, hasSize(7));

        MatcherAssert.assertThat(
                fruit,
                containsInRelativeOrder("apple", "banana", "pomegranate", "lemon"));

        MatcherAssert.assertThat(fruit, hasItems("banana", "pear"));

        MatcherAssert.assertThat(
                fruit,
                containsInAnyOrder(
                        "lemon", "pineapple", "pomegranate", "apple", "peach", "pear", "banana"));

        MatcherAssert.assertThat(fruit, not(hasItem("grape")));

        MatcherAssert.assertThat(fruit, not(hasItem(endsWith("z"))));
    }
}
