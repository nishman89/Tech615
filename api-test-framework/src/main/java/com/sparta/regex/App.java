package com.sparta.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {
        String input = "Dima,Nish, Ramla,   Sukhvinder,Wen Zhu";
        String[] stringSplitter = input.split(", *");
        for (var name : stringSplitter){
            System.out.println(name);
        }

        // COmpiling a regec pattern
        Pattern pattern = Pattern.compile("[a-zA-Z]+ *[a-zA-Z]+");
        // Create a matcher to scan the input string
        Matcher matcher = pattern.matcher(input);
        System.out.println(matcher.find());
        while(matcher.find())
        {
            System.out.println(matcher.group());
        }
    }
}
