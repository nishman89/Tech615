package com.sparta.nam.workshop;

public class App {
    public static void main(String[] args) {
        int x = 4;
        int y = x++;

        Animal animal = new Animal("Sameer", 20);
        Dog dog = new Dog("Nish", 36, "Human");
        System.out.println(animal);
        System.out.println(dog);
    }

    public int add(int x, int y){
        return x + y;
    }
    public int add(int x, int y, int z){
        return x + y +z;
    }
}
