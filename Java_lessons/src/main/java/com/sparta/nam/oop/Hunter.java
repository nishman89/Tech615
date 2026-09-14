package com.sparta.nam.oop;

public class Hunter extends Person{
    private String camera;
    public Hunter(String fName, String lName, int age, String camera){
        super(fName,lName, age);
        this.camera = camera;
    }
    public String shoot(){
        return getFullName() + " has taken a photo with their " + camera;
    }

    @Override
    public final String toString() {
        return super.toString() +  " - Camera: " + camera;
    }

    public static String sayHello(){
        return "Hello";
    }
}
