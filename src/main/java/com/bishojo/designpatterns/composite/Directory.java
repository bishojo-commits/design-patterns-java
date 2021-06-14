package com.bishojo.designpatterns.composite;

import com.bishojo.designpatterns.composite.employee.Employee;

import java.util.ArrayList;
import java.util.List;

public class Directory implements Employee {

    private List<Employee> employees;

    public Directory() {
        this.employees = new ArrayList<>();
    }

    @Override
    public void showEmployeeDetails() {
        employees.forEach(Employee::showEmployeeDetails);
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}
