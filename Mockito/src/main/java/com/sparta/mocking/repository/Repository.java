package com.sparta.mocking.repository;

import com.sparta.mocking.model.Spartan;

import java.util.List;

public interface Repository {

    boolean add(Spartan spartan);
    Spartan find(int id);
    List<Spartan> getAll();
    boolean remove(int id);
}
