package com.sparta.nam.oop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class VehicleTests {

    private Vehicle vehicle;

    @BeforeEach
    void setUp() {
        vehicle = new Vehicle(10, 0, 0, 5);
    }

    @Test
    @DisplayName("Default constructor creates a vehicle with all zero values")
    void defaultConstructorTest() {
        Vehicle v = new Vehicle();
        Assertions.assertEquals(0, v.getCapacity());
        Assertions.assertEquals(0, v.getSpeed());
        Assertions.assertEquals(0, v.getPosition());
        Assertions.assertEquals(0, v.getNumPassengers());
    }

    @Test
    @DisplayName("Two-parameter constructor sets capacity and speed correctly")
    void twoParamConstructorTest() {
        Vehicle v = new Vehicle(8, 10);
        Assertions.assertEquals(8, v.getCapacity());
        Assertions.assertEquals(10, v.getSpeed());
        Assertions.assertEquals(0, v.getPosition());
        Assertions.assertEquals(0, v.getNumPassengers());
    }

    @Test
    @DisplayName("Full constructor sets all fields correctly")
    void fullConstructorTest() {
        Vehicle v = new Vehicle(10, 3, 20, 5);
        Assertions.assertEquals(10, v.getCapacity());
        Assertions.assertEquals(3, v.getNumPassengers());
        Assertions.assertEquals(20, v.getPosition());
        Assertions.assertEquals(5, v.getSpeed());
    }

    @ParameterizedTest
    @DisplayName("setNumPassengers only accepts values between 0 and capacity")
    @CsvSource({
            "0,  0",
            "5,  5",
            "10, 10",
            "11, 0",
            "-1, 0"
    })
    void setNumPassengersTest(int input, int expected) {
        vehicle.setNumPassengers(input);
        Assertions.assertEquals(expected, vehicle.getNumPassengers());
    }

    @Test
    @DisplayName("move() advances position by speed and returns the correct message")
    void moveOnceTest() {
        String result = vehicle.move();
        Assertions.assertEquals(5, vehicle.getPosition());
        Assertions.assertEquals("Vehicle moved to position 5", result);
    }

    @Test
    @DisplayName("move(times) advances position by speed * times and returns the correct message")
    void moveMultipleTimesTest() {
        String result = vehicle.move(3);
        Assertions.assertEquals(15, vehicle.getPosition());
        Assertions.assertEquals("Vehicle moved 3 time(s) to position 15", result);
    }

    @Test
    @DisplayName("Calling move() multiple times accumulates position correctly")
    void moveAccumulatesPositionTest() {
        vehicle.move();
        vehicle.move();
        vehicle.move();
        Assertions.assertEquals(15, vehicle.getPosition());
    }

    @Test
    @DisplayName("toString returns correct format for default constructor")
    void toStringDefaultTest() {
        Vehicle v = new Vehicle();
        Assertions.assertEquals("Vehicle{capacity=0, numPassengers=0, position=0, speed=0}", v.toString());
    }

    @Test
    @DisplayName("toString returns correct format with all fields set")
    void toStringFullTest() {
        Assertions.assertEquals("Vehicle{capacity=10, numPassengers=0, position=0, speed=5}", vehicle.toString());
    }

    @Test
    @DisplayName("toString reflects updated numPassengers after setNumPassengers")
    void toStringAfterSetNumPassengersTest() {
        vehicle.setNumPassengers(5);
        Assertions.assertEquals("Vehicle{capacity=10, numPassengers=5, position=0, speed=5}", vehicle.toString());
    }

    @Test
    @DisplayName("toString reflects updated position after move()")
    void toStringAfterMoveTest() {
        vehicle.move();
        Assertions.assertEquals("Vehicle{capacity=10, numPassengers=0, position=5, speed=5}", vehicle.toString());
    }
}
