package com.sparta.nam.iterations;

public class App {
    public static void main(String[] args) {
        int[] nums = {10,6,22,-7,-3};
        System.out.println(sumForEach(nums));
        System.out.println(sumForClassic(nums));
        System.out.println(sumWhile(nums));
        System.out.println(sumDoWhile(nums));

//        for(int i = nums.length - 1; i >= 0; i--){
//            System.out.println(nums[i]);
//        }

        // BREAK AD CONTINUE
        // Find negative numer and stop as soon as it finds one
        int firstNegative = 0;
        boolean foundNegative = false;

        for (int num: nums){
            if (num < 0 && !foundNegative){
                firstNegative = num;
                foundNegative = true;
            }
        }

        int sum = 0;
        for (int num: nums){
            if (num > 0){
                sum +=num;
            }
        }
        System.out.println(sum);


       // System.out.println(firstNegative);
    }

    public static int sumForEach(int[] nums){
        int sum = 0;
        for (int num:nums){
            sum+=num;
            num = 3;
        }
        return sum;
    }

    public static int sumForClassic(int[] nums){
        int sum = 0;
        for(int i = 0; i<nums.length; i++){
            sum+=nums[i];
        }
        return sum;
    }

    public static int sumWhile(int[] nums){
        int sum = 0;
        int i = 0;
        while (i <nums.length){
            sum += nums[i];
            i++;
        }
        return sum;
    }

    public static int sumDoWhile(int[] nums){
        int sum = 0;
        int i = 0;
        do {
            sum += nums[i];
            i++;
        }while (i <nums.length);
        return sum;
    }

}
