package com.sparta.nam.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class App {
    public static void main(String[] args){
        // Array List
        ArrayList<String> names  = new ArrayList<>(List.of("Penelope", "Paul", "Sameer"));
        System.out.println(names);
        names.add("Nish");
        names.add("Eghosa");
        System.out.println(names);
        names.add(0, "Wen");
        System.out.println(names);
        System.out.println(names.size());
        System.out.println(names.contains("Paul"));
        System.out.println(names.indexOf("Paul"));
        names.remove("Nish");
        System.out.println(names.get(0));

//        names.clear();
        for(String name: names){
            System.out.println(name);

        }
        System.out.println(names);

        // HashSet
        HashSet<String> nameSet = new HashSet<>();



    }
}
