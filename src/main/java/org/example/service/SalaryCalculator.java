package org.example.service;

import org.example.model.Employee;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SalaryCalculator {

    public Double calculateSalary(Employee employee) {
        return employee.getSalary() - calculateTax(employee);
    }

    private Double calculateTax(Employee employee) {
        return employee.getSalary() * employee.getTaxRate();
    }

    public Map<String, Double> calculateSalary(List<Employee> employees) {
        Map<String, Double> salaryList = new HashMap<>();
        for (Employee employee : employees) {
            Double totalSalary = calculateSalary(employee);
            Double salaryRound = (double) Math.round(totalSalary);
            salaryList.put(employee.getNationalId(), salaryRound);
            System.out.println("name = " + employee.getName() + " national id = " + employee.getNationalId() +
                    " salary is = " + salaryRound);

        }
        return salaryList;
    }
}
