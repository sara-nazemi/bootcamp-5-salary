package org.example.model;

public class Secretary extends Employee{
    public Secretary() {
    }

    public Secretary(String nationalId, String name, Double salary, Float taxRate) {
        super(nationalId, name, salary, taxRate);
    }
}
