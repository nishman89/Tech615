package com.sparta.nam.collections;


import java.util.*;

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
        var list = new ArrayList<String>(List.of("Mikyle","Mikyle","Mikyle","Nish"));
        HashSet<String> nameSet = new HashSet<>(list);
        nameSet.add("Mikyle");
        boolean found = nameSet.contains("Paul");
        int total = nameSet.size();
        boolean isEmpty = nameSet.isEmpty();

        // HashMap
        HashMap<Integer, String> members = new HashMap();
        members.put(1, "Sonic");
        members.put(2, "Tails");
        members.put(3, "Knuckles");
//        members.put(3, "Amy");
        System.out.println(members);
        System.out.println(members.containsKey(2));
        System.out.println(members.keySet());
        System.out.println(members.values());
        System.out.println(members.entrySet());

        for(var entry : members.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        // Stacks - Last In First Out

        Stack<String> stack = new Stack<>();

        stack.push("Sukhvinder");
        stack.push("Safica");
        stack.push("Wen");

        String removed = stack.pop();
        System.out.println(stack.peek());
        // Queue - FIFO
//
//        Queue<String> queue = new LinkedList<>();
//        System.out.println(queue.offer("Mario"));
//        queue.offer("Waluigi");
//        System.out.println(queue.poll());
//
//        List<String> tickets = new ArrayList<>();
//        tickets.add("Fix login bug");
//        tickets.add("Update homepage");
//        tickets.add("Write unit tests");
//        tickets.add("Deploy to staging");
//        tickets.add("Review PR");
//
//        Queue<String> queue1 = new LinkedList<>();
//
//        for (String ticket : tickets) {
//            queue1.offer(ticket);
//        }
//
//        while (!queue1.isEmpty()) {
//            System.out.println("Processing: " + queue.poll());
//        }
//
//        System.out.println("All tasks complete");

        int score = 40;
        System.out.println(getGrade(score));
    }
     public static String getGrade(int score){

        return score < 40 ? "Fail" :
                score >= 70 ?  "Merit" : "Pass";

//        if(score >= 40){
//            return "Pass";
//        } else {
//            return "Fail";
//        }
     }
}
