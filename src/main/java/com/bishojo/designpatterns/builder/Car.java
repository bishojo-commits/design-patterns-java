package com.bishojo.designpatterns.builder;

public class Car implements BuilderInterface {
    private final Vehicle vehicle;

    public Car(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void buildBody() {
        vehicle.add("This is the body of the car.");
    }

    @Override
    public void insertWheels() {
        vehicle.add("4 wheels are added.");
    }

    @Override
    public void addHeadlights() {
        vehicle.add("2 headlights are added.");
    }

    @Override
    public Vehicle getVehicle() {
        return vehicle;
    }
}
