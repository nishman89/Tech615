
package com.sparta.nam.refactoring_unit_testing;

public class App {
    public static void main(String[] args) {
        int timeOfDay = 2;

        String result = getGreeting(timeOfDay);
        System.out.println(result);


    }

    public static String getGreeting(int timeOfDay) {
        if(timeOfDay >= 5 && timeOfDay < 12){
            return "Good morning!";
        } else if(timeOfDay >= 12 && timeOfDay <= 18){
            return "Good afternoon!";
        } else {
           return "Good evening!";
        }

        // Boundary Value Analysis - most erros take place on the boundary
        // Write tests


    }
    public static String getClassificationsByAge(int ageOfViewer)
    {
        String result;
        if (ageOfViewer < 12)
        {
            result = "U, PG & 12 films are available.";
        }
        else if (ageOfViewer < 15)
        {
            result = "U, PG, 12 & 15 films are available.";
        }
        else
        {
            result = "All films are available.";
        }
        return result;
    }
    // No outband limit (minus numbers and numbersover 24)
    // Does have to be too long
    // Not reusable
    // Hard to test
    // Doing too much!! The code is tightly coupled to the console for output - normall this would be done
    // through a GUI or web page - Single Responsibility Principle

}
