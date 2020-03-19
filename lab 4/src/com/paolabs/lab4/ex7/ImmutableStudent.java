package com.paolabs.lab4.ex7;

public final class ImmutableStudent {

    private final int id;
    private final String name;
    private final Age age;

    public ImmutableStudent(int id, String name, Age age) {
        this.name = name;
        this.id = id;
        this.age = new Age(age.getDay(), age.getMonth(), age.getYear());
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Age getAge() {
        return age;
    }
}