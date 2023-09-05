package org.example.model;

public abstract class Employee {
    protected String nationalId;
    protected String name;
    protected Double salary;

    protected Float taxRate;

    public Employee() {
    }

    public Employee(String nationalId, String name, Double salary, Float taxRate) {
        this.nationalId = nationalId;
        this.name = name;
        this.salary = salary;
        this.taxRate = taxRate;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Float getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(Float taxRate) {
        this.taxRate = taxRate;
    }
}
