package com.sparta.nam.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        String[] trainers = {"Paul", "Faith", "Dima"};
        int[] ints = {72,45,4,5, 432,43};
        String[] names = new String[5];
        Object[] mixed = {1, "one", true, 1.0}; // DO NOT DO THIS!!!
        System.out.println(trainers[0]);
        System.out.println(trainers[trainers.length - 1]);
        System.out.println(trainers.length);

        String[] slice = Arrays.copyOfRange(trainers, 0,2);
        for (var item: slice){
            System.out.println(item);
        }
        for (var num: ints){
            System.out.println(num);
        }
        System.out.println("//");
        Arrays.sort(ints);
        for (var num: ints){
            System.out.println(num);
        }

        // Step 1: create the array
        int[] scores = {72, 45, 88, 91, 63, 55, 79, 84};

        // Step 2: print the score at index 3
        System.out.println("Score at index 3: " + scores[3]);

        // Step 3: correct the score at index 1
        scores[1] = 60;
        System.out.println("After correction: " + Arrays.toString(scores));

        // Step 4: sort ascending in place
        Arrays.sort(scores);
        System.out.println("After sorting:    " + Arrays.toString(scores));

        // Step 5: lowest is first element after sorting, highest is last
        System.out.println("Lowest: " + scores[0]);
        System.out.println("Highest: " + scores[scores.length - 1]);

    }
}
