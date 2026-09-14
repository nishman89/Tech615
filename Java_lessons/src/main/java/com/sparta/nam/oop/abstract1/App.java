package com.sparta.nam.oop.abstract1;

public class App {
    private static Rectangle rectangle;
    public static void main(String[] args) {
        rectangle = new Rectangle(4,5);
        Circle circle = new Circle(5);
        Shape[]shapes = new Shape[]{circle, rectangle};
        for (Shape shape : shapes){
            System.out.println(shape.calculateArea());
        }


    }
}
