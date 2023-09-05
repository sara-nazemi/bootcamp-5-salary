package org.example;

import org.example.model.*;
import org.example.service.SalaryCalculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Employee manager = new Manager("0013623625", "x", 2000000d, 0.2f);
        Employee driver = new Driver("0013623626", "y", 2500000d, 0.2f);
        Employee secretary = new Secretary("0013623627", "z", 1500000d, 0.2f);
        Employee technical = new Technical("0013623628", "w", 3500000d, 0.2f);
        Employee accountant = new Accountant("0013623629", "s", 4500000d, 0.2f);

        List<Employee> employees = new ArrayList<>();
        employees.add(manager);
        employees.add(driver);
        employees.add(secretary);
        employees.add(technical);
        employees.add(accountant);

        SalaryCalculator salaryCalculator = new SalaryCalculator();
        Map<String, Double> salaryList = salaryCalculator.calculateSalary(employees);

        for (Map.Entry<String, Double> entry : salaryList.entrySet()) {
            String key = entry.getKey();
            Double value = entry.getValue();
            System.out.println("Key=" + key + ", Value=" + value);
        }
    }
}