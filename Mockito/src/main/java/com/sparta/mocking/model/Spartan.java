package com.sparta.mocking.model;

import java.time.LocalDate;
import java.util.Objects;

public class Spartan {

    private int id;
    private String name;
    private String course;
    private LocalDate startDate;

    public Spartan(String name, String course, LocalDate startDate) {
        this.name = name;
        this.course = course;
        this.startDate = startDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    @Override
    public String toString() {
        return "Spartan{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", course='" + course + '\'' +
                ", startDate=" + startDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Spartan spartan = (Spartan) o;
        return id == spartan.id && Objects.equals(name, spartan.name) && Objects.equals(
                course, spartan.course) && Objects.equals(startDate, spartan.startDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, course, startDate);
    }
}
