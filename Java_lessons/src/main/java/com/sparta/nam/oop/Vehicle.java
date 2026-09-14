package com.sparta.nam.oop;

public class Vehicle {

    private int capacity;
    private int numPassengers = 0;
    private int position = 0;
    private int speed;

    public Vehicle() {}

    public Vehicle(int capacity, int speed) {
        this.capacity = capacity;
        this.speed = speed;
    }

    public Vehicle(int capacity, int numPassengers, int position, int speed) {
        this(capacity, speed);
        this.position = position;
        setNumPassengers(numPassengers);
    }

    public int getCapacity() {
        return capacity;
    }

    public int getSpeed() {
        return speed;
    }

    public int getPosition() {
        return position;
    }

    public int getNumPassengers() {
        return numPassengers;
    }

    public void setNumPassengers(int numPassengers) {
        if (numPassengers >= 0 && numPassengers <= capacity) {
            this.numPassengers = numPassengers;
        }
    }

    public String move() {
        position += speed;
        return "Vehicle moved to position " + position;
    }

    public String move(int times) {
        position += speed * times;
        return "Vehicle moved " + times + " time(s) to position " + position;
    }

    @Override
    public String toString() {
        return "Vehicle{capacity=" + getCapacity() + ", numPassengers=" + getNumPassengers() +
                ", position=" + getPosition() + ", speed=" + getSpeed() + "}";
    }
}