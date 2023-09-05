package org.example.model;

public class Manager extends Employee{
    public Manager() {
    }

    public Manager(String nationalId, String name, Double salary, Float taxRate) {
        super(nationalId, name, salary, taxRate);
    }
}
