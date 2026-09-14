package com.sparta.nam.oop.abstract1;

public final class Circle extends Shape{
    private int radius;
    public Circle(int radius){
        this.radius = radius;
    }
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString(){
        return super.toString() + " Area: " + calculateArea();
    }
}
