package com.bishojo.designpatterns.builder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

public class CarTest {
    private final Vehicle vehicle = new Vehicle();
    private final Car car = new Car(vehicle);

    @Test
    public void testBodyIsBuild() {
        car.buildBody();
        LinkedList<String> parts = vehicle.getParts();

        Assertions.assertEquals("This is the body of the car.", parts.getLast());
    }

    @Test
    public void testWheelsAreAdded() {
        car.insertWheels();
        LinkedList<String> parts = vehicle.getParts();

        Assertions.assertEquals("4 wheels are added.", parts.getLast());
    }

    @Test
    public void testHeadlightsAreAdded() {
        car.addHeadlights();
        LinkedList<String> parts = vehicle.getParts();

        Assertions.assertEquals("2 headlights are added.", parts.getLast());
    }
}
