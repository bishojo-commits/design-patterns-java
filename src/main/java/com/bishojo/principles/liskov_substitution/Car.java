package com.bishojo.principles.liskov_substitution;

public class Car extends Vehicle {
    @Override
    int getSpeed() {
        return 100;
    }

    @Override
    int getCubicCapacity() {
        return 2000;
    }

    boolean isOldTimer() {
        return true;
    }
}
