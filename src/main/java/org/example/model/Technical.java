package org.example.model;

public class Technical extends Employee{
    public Technical() {
    }

    public Technical(String nationalId, String name, Double salary, Float taxRate) {
        super(nationalId, name, salary, taxRate);
    }
}
