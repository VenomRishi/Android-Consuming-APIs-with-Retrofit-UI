package com.acer.dev.retrofitdemoui;


import java.util.Arrays;

public class Employee {

    public final String name;
    public final String profile_pic;
    public final int age;
    public final Company[] companies;

    public String getProfile_pic() {
        return profile_pic;
    }

    public int getAge() {
        return age;
    }

    public Company[] getCompanies() {
        return companies;
    }

    public String getName() {
        return name;
    }

    public Employee(String name, String profile_pic, int age, Company[] companies) {
        this.name = name;

        this.profile_pic = profile_pic;
        this.age = age;
        this.companies = companies;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "profile_pic='" + profile_pic + '\'' +
                ", age=" + age +
                ", companies=" + Arrays.toString(companies) +
                '}';
    }
}
