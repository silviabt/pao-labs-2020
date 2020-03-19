package com.paolabs.lab4.ex6;

public final class ImmutableStudent {

    private final int id;
    private final String name;

    public ImmutableStudent(int id, String name) {
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}