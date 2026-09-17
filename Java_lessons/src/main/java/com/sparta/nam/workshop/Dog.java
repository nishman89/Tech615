package com.sparta.nam.workshop;

public class Dog extends Animal{
    private String breed;
    public Dog(String name, int age, String breed){
        super(name, age);
        this.breed = breed;
    }

    @Override
    public String toString() {
        return super.toString() + " Dog{" +
                "breed='" + breed + '\'' +
                '}';
    }
}
