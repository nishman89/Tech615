package com.sparta.nam.strings;

public class App {
    public static void main(String[] args) {
//        String name = "Rukieya";
//        int len = name.length();
//        char c = name.charAt(2);
//        int pos = name.indexOf('u');
//        String sub = name.substring(0,4);
//
//        var newName = name.toUpperCase();

        // == vs .equals()

        // == checks if two references (reference points) point to the same object
        // .equals() checks if two objects have the same value (content equality)
//        String a = "hello"; // wahts stored in a is the memory locations of "hello" 0X6DSADS
//        String b = "hello";
//        String c = new String("hello"); // 000X6DSADS
//        System.out.println(b == a);
//        System.out.println(b == c);
//        System.out.println(a.equals(b)); // true
//        System.out.println(a.equals(c)); // true


        // StringBuilder - MUTABLE sequence of characters. Unlike string, which is IMMUTABLE, sb alllows you to modify content
        // without creating a new object each time

        StringBuilder sb = new StringBuilder();
        sb.append("Java");
        sb.append(", ");
        sb.append("Python");
        sb.append(", ");
        sb.append("C#");
        System.out.println(sb);
        sb.append("Java");
        sb.append(", ");
        sb.append("Python");
        sb.append(", ");
        sb.append("C#");
        sb.append("Java");
        sb.append(", ");
        sb.append("Python");
        sb.append(", ");
        sb.append("C#");

    }
}
