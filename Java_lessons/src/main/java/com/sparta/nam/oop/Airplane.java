package com.sparta.nam.oop;


public class Airplane extends Vehicle  {

    private int altitude;
    private String airline;

    public Airplane(int capacity, int speed, String airline) {
        super(capacity, speed);
        this.airline = airline;
    }

    public int getAltitude() {
        return altitude;
    }

    public String getAirline() {
        return airline;
    }

    public void ascend(int distance) {
        altitude += distance;
    }

    public void descend(int distance) {
        altitude = Math.max(0, altitude - distance);
    }

    @Override
    public String move() {
        super.move();
        return "Moving along at an altitude of " + altitude + " metres";
    }

    @Override
    public String move(int times) {
        super.move(times);
        return "Moving along " + times + " times at an altitude of " + altitude + " metres";
    }

    @Override
    public String toString() {
        return super.toString() + " Airplane{airline=" + airline + ", altitude=" + altitude + "}";
    }
}