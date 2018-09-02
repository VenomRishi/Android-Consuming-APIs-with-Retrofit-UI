package com.acer.dev.retrofitdemoui;

public class Company {
    public final String name;
    public final String location;

    public Company(String name, String location) {
        this.name = name;
        this.location = location;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}