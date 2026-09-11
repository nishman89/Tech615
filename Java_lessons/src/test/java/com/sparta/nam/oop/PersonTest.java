package com.sparta.nam.oop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class PersonTest {

    @Test
    @DisplayName("When a person is constructed they have the correct name")
    public void testName(){
        Person person = new Person("Nish", "Mandal", 36);
        var actual = person.getFullName();
        Assertions.assertEquals("Nish Mandal", actual);
    }

    @Test
    @DisplayName("When a person is constructed they have the correct age")
    public void testAge(){
        Person person = new Person("Nish", "Mandal", 36);
        var actual = person.getAge();
        Assertions.assertEquals(36, actual);
    }

    @ParameterizedTest
    @DisplayName("Only positive ages can be set")
    @CsvSource({
            "45, 45",
            "0, 0",
            "-1, 20",
            "-5, 20"
    })
    public void setAgeTest(int inputAge, int expectedNewAge) {
        Person p = new Person("Cathy", "French", 20);
        p.setAge(inputAge);
        Assertions.assertEquals(expectedNewAge, p.getAge());
    }
}



