package org.example.model;

public class Driver extends Employee{
    public Driver() {
    }

    public Driver(String nationalId, String name, Double salary, Float taxRate) {
        super(nationalId, name, salary, taxRate);
    }
}
