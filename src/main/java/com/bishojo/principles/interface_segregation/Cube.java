package com.bishojo.principles.interface_segregation;

public class Cube implements SolidShape, Shape {

    @Override
    public double area() {
        return 100;
    }

    @Override
    public double volume() {
        return 1000;
    }
}
