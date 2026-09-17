package com.sparta.nam.enums;

import static com.sparta.nam.enums.Day.*;

public class App {


        public static void main(String[] args) {
            Day dayOfTheWeek = SATURDAY;
            if(dayOfTheWeek == SATURDAY || dayOfTheWeek == Day.SUNDAY){
                System.out.println("It's the weekend");
            } else {
                System.out.println("It's a weekday");
            }
    }
}
