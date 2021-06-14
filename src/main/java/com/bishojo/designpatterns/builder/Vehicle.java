package com.bishojo.designpatterns.builder;

import java.util.LinkedList;

public class Vehicle {
    private final LinkedList<String> parts;

    public Vehicle() {
        this.parts = new LinkedList<>();
    }

    public void add(String part) {
        parts.addLast(part);
    }

    public void show() {
        System.out.println("Vehicle completed as below: ");
        parts.forEach(System.out::println);
    }

    public LinkedList<String> getParts() {
        return parts;
    }

}
