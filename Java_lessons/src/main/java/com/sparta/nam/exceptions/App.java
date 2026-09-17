package com.sparta.nam.exceptions;

import java.text.ParseException;

public class App {
    public static void main(String[] args){
//        Animal myDog = new Animal("Fido", 10);
//        Animal myCat = new Animal();

//        try {
//            System.out.println(myDog.getName());
//            System.out.println(myCat.getName());
//        }catch(NullPointerException e){
//            System.out.println(e.getMessage());
//        }
//        try {
//            myCat.setVaccinationDate("10-05-2015");
//            // myDog.setVaccinationDate("15 June, 2018");
//            myDog.setVaccinationDate("18-08-2020");
//        } catch(ParseException e){
//            System.out.println(e.getMessage());
//        } finally {
//            System.out.println("Hello, I always run");
//        }


        try {
            Animal myHamster = new Animal("Hamish", 2, "27-07-2022");
            Animal myRabbit = new Animal(null, 1, "27-07-2022");
            Animal myOtherDog = new Animal("Fluffy", -2, "27-07-2022");
            Animal myOtherCat = new Animal("Snowflake", 12, "27 July, 2022");
        }
        catch (NullPointerException e) {
            System.out.println("Name cannot be null");
        }
        catch (IllegalArgumentException e) {
            System.out.println("Age cannot be negative");
        }
        catch (RuntimeException e) {
            System.out.println("Caught an RuntimeException object");
        }
        catch (ParseException e) {
            System.out.println("Date format is incorrect");
        }
        catch (Exception e) {
            System.out.println("Caught an Exception object");
        }


        System.out.println("Program is finished");
    }
}
