//package com.sparta.nam.oop;
//
//
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//
//public class AirplaneTests {
//
//    private Airplane airplane;
//
//    @BeforeEach
//    void setUp() {
//        airplane = new Airplane(200, 100, "JetsRUs");
//    }
//
//    @Test
//    @DisplayName("Constructor sets capacity, speed and airline correctly")
//    void constructorTest() {
//        Assertions.assertEquals(200, airplane.getCapacity());
//        Assertions.assertEquals(100, airplane.getSpeed());
//        Assertions.assertEquals("JetsRUs", airplane.getAirline());
//        Assertions.assertEquals(0, airplane.getAltitude());
//        Assertions.assertEquals(0, airplane.getPosition());
//    }
//
//    @Test
//    @DisplayName("ascend increases altitude by the given amount")
//    void ascendTest() {
//        airplane.ascend(500);
//        Assertions.assertEquals(500, airplane.getAltitude());
//    }
//
//    @Test
//    @DisplayName("descend decreases altitude by the given amount")
//    void descendTest() {
//        airplane.ascend(500);
//        airplane.descend(200);
//        Assertions.assertEquals(300, airplane.getAltitude());
//    }
//
//    @Test
//    @DisplayName("descend does not take altitude below zero")
//    void descendBelowZeroTest() {
//        airplane.ascend(300);
//        airplane.descend(500);
//        Assertions.assertEquals(0, airplane.getAltitude());
//    }
//
//    @Test
//    @DisplayName("descend to exactly zero is valid")
//    void descendToZeroTest() {
//        airplane.ascend(300);
//        airplane.descend(300);
//        Assertions.assertEquals(0, airplane.getAltitude());
//    }
//
//    @Test
//    @DisplayName("move() returns correct message referencing altitude")
//    void moveOnceTest() {
//        airplane.ascend(500);
//        String result = airplane.move();
//        Assertions.assertEquals("Moving along at an altitude of 500 metres", result);
//    }
//
//    @Test
//    @DisplayName("move(times) returns correct message referencing altitude")
//    void moveMultipleTimesTest() {
//        airplane.ascend(500);
//        String result = airplane.move(3);
//        Assertions.assertEquals("Moving along 3 times at an altitude of 500 metres", result);
//    }
//
//    @Test
//    @DisplayName("toString includes both Vehicle and Airplane fields")
//    void toStringTest() {
//        airplane.setNumPassengers(157);
//        airplane.ascend(500);
//        airplane.move(3);
//        String result = airplane.toString();
//        Assertions.assertEquals(
//                "Vehicle{capacity=200, numPassengers=157, position=300, speed=100} Airplane{airline=JetsRUs, altitude=500}",
//                result
//        );
//    }
//
//    @Test
//    @DisplayName("setNumPassengers is inherited and still validates correctly")
//    void setNumPassengersInheritedTest() {
//        airplane.setNumPassengers(157);
//        Assertions.assertEquals(157, airplane.getNumPassengers());
//        airplane.setNumPassengers(300);
//        Assertions.assertEquals(157, airplane.getNumPassengers());
//    }
//}