package com.sparta.nam.workshop;

public class Animal implements Eatable{
    private String name;
    private Integer age;
    public Animal(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public String eat() {
        return "I am eating";
    }
}
