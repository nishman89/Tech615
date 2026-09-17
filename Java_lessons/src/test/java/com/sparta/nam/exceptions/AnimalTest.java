package com.sparta.nam.exceptions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AnimalTest {

    @Test
    @DisplayName("Given a number more than 0, getAge returns correct age")
    public void setAgeHappyPath(){
        Animal sut = new Animal();
        sut.setAge(1);
        Assertions.assertEquals(1,sut.getAge());
    }

    @Test
    @DisplayName("Given an in less than 0, setAge throws IllegalArgumentException")
    public void setAgeSadPath(){
        Animal sut = new Animal();
        var exception = Assertions.assertThrows(IllegalArgumentException.class,() -> sut.setAge(-1));
        Assertions.assertEquals("Age cannot be less than 0",exception.getMessage());
    }
}
