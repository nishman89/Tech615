package com.sparta.mocking;

import com.sparta.mocking.model.Spartan;
import com.sparta.mocking.repository.SpartanListRepository;

import java.time.LocalDate;

public class SpartanApp {
    public static void main(String[] args) {
        Spartan s1 = new Spartan("Cathy", "Java", LocalDate.now());
        Spartan s2 = new Spartan("James", "C#", LocalDate.now().minusDays(2));

        SpartanService service = new SpartanService(new SpartanListRepository());

        service.addSpartan(s1);
        service.addSpartan(s2);

        System.out.println("Number of Spartans: " + service.getNumSpartans());

        System.out.println("\nFind Spartan with id 1");
        System.out.println(service.findSpartan(1).toString());

        System.out.println("\nGet all Spartans");
        System.out.println(service.getAllSpartans());

        System.out.println("\nNew Spartans");
        System.out.println(service.getSpartansCreatedLast24Hours());
    }
}
