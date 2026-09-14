package com.sparta.nam.oop;

public class Person implements Movable{
    private String firstName;
    private String lastName;
    protected int age;

    public Person(String firstName, String lastName, int age) {
        this(firstName, lastName);
        setAge(age);
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
   public Person(){}

    public String getFullName(){
        return firstName + " " + lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // accessor methods - getters and setters
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    @Override
    public String toString() {
        return getFullName() + " is " + age;
    }

    @Override
    public String move() {
        return "Walking along";
    }

    @Override
    public String move(int times) {
        return "Walking along " + times + " times.";
    }
}
