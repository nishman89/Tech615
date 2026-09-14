package com.sparta.nam.oop.abstract1;

// Cannot be instantaited
// Only exists to be derived from
// Can contain normal methods (i.e. have a method body) and abstract methods (don't have a method body, and dervied classes must
// have their own version of it
public abstract class Shape {
    public abstract double calculateArea();
    @Override
    public String toString(){
        return "This is a " + getClass().getSimpleName() + " shape";
    }
}
