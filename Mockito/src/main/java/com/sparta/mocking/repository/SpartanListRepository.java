package com.sparta.mocking.repository;

import com.sparta.mocking.model.Spartan;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.logging.Logger;

public class SpartanListRepository implements Repository {

    private final List<Spartan> spartans = new ArrayList<>();
    private final Logger logger = Logger.getLogger(SpartanListRepository.class.getName());

    @Override
    public boolean add(Spartan spartan) {
        try {
            spartan.setId(spartans.getLast().getId() + 1);
        } catch (NoSuchElementException e) {
            spartan.setId(1);
        }
        spartans.add(spartan);
        return true;
    }

    @Override
    public Spartan find(int id) {
        return spartans.stream()
                       .filter(s -> s.getId() == id)
                       .findFirst()
                       .orElseThrow();
    }

    @Override
    public List<Spartan> getAll() {
        return spartans;
    }

    @Override
    public boolean remove(int id) {
        Spartan spartan = null;
        try {
            spartan = this.find(id);
        } catch (NoSuchElementException e) {
            logger.warning("The id: " + id + " was not found");
            return false;
        }
        spartans.remove(spartan);
        return true;
    }
}
