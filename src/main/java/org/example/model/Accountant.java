package org.example.model;

public class Accountant extends  Employee{
    public Accountant() {
    }

    public Accountant(String nationalId, String name, Double salary, Float taxRate) {
        super(nationalId, name, salary, taxRate);
    }
}
