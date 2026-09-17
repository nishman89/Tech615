package com.sparta.nam.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class App {
    public static void main(String[] args){
        // Declarative vs Imperative
        var sumEven = 0;
        var nums = new ArrayList<Integer>(List.of(2,3,4,5,64,99));
        for(int num : nums){
            if(isEven(num)){
                sumEven += num;
            }
        }
//        System.out.println(sumEven);

        var sumEvenL = nums.stream().filter(num -> num % 2 == 0).mapToInt(num -> num).sum();
        int[] arr = {12,3,4};
        Arrays.stream(arr).count();
        var streamExample = nums.stream().filter(num -> num % 2 == 0).mapToInt(num -> num).toArray();
// for a stream to be "excuted" you need to iterate through it - either by a loop or aterminator operatation

        List<String> beatles = new ArrayList<String>(List.of("John","Paul","George","Ringo"));
        for (String name:beatles){
            if (name.startsWith("J")){
                System.out.println(name);
            }
        }

        List<String> beatlesStream = beatles.stream().filter(name->name.startsWith("J")).map(name -> name.toUpperCase()).toList();
        beatlesStream.forEach(name -> System.out.println(name));

        // var nums = new ArrayList<Integer>(List.of(2,3,4,5,64,99));



    }

    public static boolean isEven(int num){
        return num  % 2 ==0;
    }
}
