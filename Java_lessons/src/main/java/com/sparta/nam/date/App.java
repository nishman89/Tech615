package com.sparta.nam.date;

import java.nio.channels.GatheringByteChannel;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) {
        //Localdate
        var now = LocalDate.now();
        var nextWeek = now.plusWeeks(1);
        var anotherDate = now.withDayOfMonth(5).withYear(2026);
        if (anotherDate.getMonth().equals(nextWeek.getDayOfMonth())){
            System.out.println("Yes they are the same month");
        } else{
            System.out.println("They are not the same month");
        }

        System.out.println(now);

        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("d MMMM y");
        System.out.println(now.format(outputFormatter));

        var nishBirthday = LocalDate.of(1989,11,2);
        // Work out how old I am
        // How many days until my birthday
    }
}
