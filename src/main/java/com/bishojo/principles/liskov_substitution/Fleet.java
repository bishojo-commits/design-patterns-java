package com.bishojo.principles.liskov_substitution;

public class Fleet {
    public static void main(String[] args) {
        Vehicle vehicle = new Bus();
        int speed = vehicle.getSpeed();

        System.out.println("Speed of Bus: " + speed);

        vehicle = new Car();
        int cubicCapacity = vehicle.getCubicCapacity();

        System.out.println("CubicCapacity of Car: " + cubicCapacity);
    }
}
