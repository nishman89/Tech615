package com.sparta.nam.workshop;

public class Palindrome {
    public static void main(String[] args) {
        String palindrome = "racecar";
        System.out.println(isPalindrome(palindrome));
    }

    public static boolean isPalindrome(String string){
//        StringBuilder stringBuilder = new StringBuilder(string);
//        var reverse = stringBuilder.reverse().toString();
//        return string.equals(reverse);
        String reverse = "";
        for (char c : string.toCharArray()){
            reverse+=c;
        }
        return string.equals(reverse);
    }
}
