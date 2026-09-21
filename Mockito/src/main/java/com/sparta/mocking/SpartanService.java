package com.sparta.mocking;

import com.sparta.mocking.model.Spartan;
import com.sparta.mocking.repository.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class SpartanService {
    private final Repository repository;

    public SpartanService(Repository repository) {
        this.repository = repository;
    }

    public boolean addSpartan(Spartan spartan) {
        return repository.add(spartan);
    }

    public int getNumSpartans() {
        List<Spartan> spartans = repository.getAll();
        return spartans.size();
    }

    public List<Spartan> getAllSpartans() {
        return repository.getAll();
    }

    public Spartan findSpartan(int id) {
        try {
            return repository.find(id);
        } catch (NoSuchElementException e) {
            throw new RuntimeException("Id: " + id + " could not be found");
        }
    }

    public List<Spartan> getSpartansCreatedLast24Hours() {
        List<Spartan> newSpartans = new ArrayList<>();
        for (var spartan : repository.getAll()) {
            if ( spartan.getStartDate().plusDays(1).isAfter(LocalDate.now())) {
                newSpartans.add(spartan);
            }
        }
        return newSpartans;
    }

    public boolean removeSpartan(int id) {
        return repository.remove(id);
    }
}
