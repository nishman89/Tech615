package com.sparta.nam.iterations;

public class Exercises {

    public static void main(String[] args) {
        int[] nums = {10, 6, 22, -7, 3};
        System.out.println("Highest for-each loop:  " + highestForEach(nums));
        System.out.println("Highest for loop:       " + highestFor(nums));
        System.out.println("Highest while loop:     " + highestWhile(nums));
        System.out.println("Highest do-while loop:  " + highestDoWhile(nums));
    }

    public static int highestForEach(int[] nums) {

        int highest = Integer.MIN_VALUE;
        for (int num: nums){
            if (highest < num){
                highest = num;
            }
        }
        return highest;
    }

    public static int highestFor(int[] nums) {
        int highest = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(highest < nums[i]){
                highest = nums[i];
            }
        }
        return highest;
    }

    public static int highestWhile(int[] nums) {
        int highest = Integer.MIN_VALUE;
        int i = 0;
        while (i<nums.length){
            if (highest<nums[i]){
                highest=nums[i];
            }
            i++;
        }
        return highest;
    }

    public static int highestDoWhile(int[] nums) {
        int highest = Integer.MIN_VALUE;
        int i = 0;
        do{
            if (highest<nums[i]){
                highest=nums[i];
            }
            i++;
        }while (i<nums.length);
        return highest;    }
}
