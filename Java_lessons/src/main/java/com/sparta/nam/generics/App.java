package com.sparta.nam.generics;

public class App {
    public static void main(String[] args) {
        IntegerRectangle iRect = new IntegerRectangle(4,5);
        DoubleRectangle dRect = new DoubleRectangle(4.0,5.0);
        ObjectRectangle oRect = new ObjectRectangle(4.0,5.0);
        System.out.println("Double Rectangle Area: " + (Double)oRect.getLength() * (Double)oRect.getWidth()); // Not type safe
        System.out.println("Double Rectangle Area: " + dRect.getLength() * dRect.getWidth());
        System.out.println("Integer Rectangle Area: " + iRect.getLength() * iRect.getWidth());
        GenericRectangle<Integer> gRect = new GenericRectangle<>(4,5);
        System.out.println("Generic Rectangle Area: " + gRect.getLength() * gRect.getWidth());

    }

    public static <V> void outputToConsole(V value){
        System.out.println("Rectangle has an area of " + value);
    }


}
