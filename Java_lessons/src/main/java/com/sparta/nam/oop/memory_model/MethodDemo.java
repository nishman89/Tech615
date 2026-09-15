package com.sparta.nam.oop.memory_model; // replace with the name of your package
import com.sparta.nam.oop.Person;

public class MethodDemo
{
    public static void main(String[] args)
    {
        Person sameer = new Person("Sameer", "Ishfaq", 18 );
        System.out.println(sameer.getFullName());
        Person wen = new Person("Wen", "Zhu", 21);
        double zaid = 4.2;
        String nish = aMethod(sameer, zaid);
    }
    public static String aMethod(Person david, double cathy)
    {
        david.setLastName("Harvey");
        david.setAge(26);
        cathy *= 2;
        return david.getFullName();
    }
}