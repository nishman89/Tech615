package com.sparta.nam.exceptions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Animal {
    private String name;
    private int age;
    private Date vaccinationDate;

    public Animal() {}

    public Animal(String name, int age, String date) throws ParseException {
        setName(name);
        setAge(age);
        setVaccinationDate(date);
    }

    public String getName() {
        return name.toUpperCase();
    }

    public void setAge(int newAge) {
        if (newAge < 0) {
            throw new IllegalArgumentException("Age cannot be less than 0");
        }
        age = newAge;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", vaccinationDate=" + vaccinationDate +
                '}';
    }

    public void setVaccinationDate(String dateString) throws ParseException {
        this.vaccinationDate = new SimpleDateFormat("dd-MM-yyyy").parse(dateString);
    }
}
