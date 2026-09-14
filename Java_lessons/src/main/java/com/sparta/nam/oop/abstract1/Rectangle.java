package com.sparta.nam.oop.abstract1;

public final class Rectangle extends Shape{

    private int width;
    private int height;

    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }
    // All classes derived from abstract classes, if they have abstract methods,
    // Must implement those abstract methods
    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public String toString(){
        return super.toString() + " Area:" + calculateArea();
    }
}
