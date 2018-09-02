package com.acer.dev.retrofitdemoui;

import java.util.Arrays;

public class Employees {

    public final Employee[] employees;

    public Employees(Employee[] employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "employees=" + Arrays.toString(employees) +
                '}';
    }
}
