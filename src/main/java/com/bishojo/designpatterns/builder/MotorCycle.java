package com.bishojo.designpatterns.builder;

public class MotorCycle implements BuilderInterface {
    private final Vehicle vehicle;

    public MotorCycle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void buildBody() {
        vehicle.add("This is the body of the motorcycle.");
    }

    @Override
    public void insertWheels() {
        vehicle.add("2 wheels are added.");
    }

    @Override
    public void addHeadlights() {
        vehicle.add("1 headlight is added.");
    }

    @Override
    public Vehicle getVehicle() {
        return vehicle;
    }
}
