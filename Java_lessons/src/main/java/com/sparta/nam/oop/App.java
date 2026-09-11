package com.sparta.nam.oop;

public class App {
    public static void main(String[] args) {
        Person nish = new Person("Nish", "Mandal", -1);
        System.out.println(nish.getAge());
//        nish.setAge(37);
//        System.out.println(nish.getAge());
//        System.out.println(nish.getFullName());
        Person eghosa = new Person("Eghosa", "Ogua");

        // compile time polymorphism
//        add(1,2);
//        add(1,2,3);
    }


//    // Method overloading
//    public static int add(int a, int b){
//        return a + b;
//    }
//
//    public static double add(double a, double b){
//        return a + b;
//    }
//
//    public static int add(int a, int b, int c){
//        return a + b + c;
//    }
}
