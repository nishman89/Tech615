package com.sparta.nam.oop;

import java.util.Objects;

public class Person implements Comparable<Person>{
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


    public String move() {
        return "Walking along";
    }


    public String move(int times) {
        return "Walking along " + times + " times.";
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Person p)) return false;
        return Objects.equals(firstName, p.firstName) && Objects.equals(lastName, p.lastName) && Objects.equals(age, p.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName,lastName,age);
    }

//    @Override
//    public int compareTo(Person other) {
//        if (other == null) {
//            return 1;
//        }
//        int lastNameCompare =  this.lastName.compareTo(other.lastName);
//        if (lastNameCompare != 0) return lastNameCompare;
//
//        // last names are equal, compare to the first name
//        int firstNameCompare = this.firstName.compareTo(other.firstName);
//        if (firstNameCompare != 0) return firstNameCompare;
//
//        // name are equal, sort by age
//        return this.age == other.age;
//    }
}
