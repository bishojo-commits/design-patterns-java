package com.bishojo.designpatterns.composite.employee;

public class Developer implements Employee {

    private final long id;
    private final String name;
    private final String position;

    public Developer(long id, String name, String position) {
        this.id = id;
        this.name = name;
        this.position = position;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println("Employee Id: " + id);
        System.out.println("Employee name: " + name);
        System.out.println("Employee position: " + position);
    }
}
