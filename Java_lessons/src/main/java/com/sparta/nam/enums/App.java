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


            System.out.println(Day.MONDAY.ordinal());
            System.out.println(Day.SUNDAY.ordinal());
            System.out.println(Day.SUNDAY.toString());

            for(Day day: Day.values()){
                System.out.println(day);
            }
            System.out.println(getWeekend(Day.SUNDAY));

        }

        public static String getWeekend(Day day){

            String result = "";
            switch(day){
                case SATURDAY:
                case SUNDAY:
                   result = "It's the weekend";
                   break;
                default:
                    result = "It's a weekday";
                    break;
            }
            return result;
        }
}
