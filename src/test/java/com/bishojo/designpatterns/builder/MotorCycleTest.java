package com.bishojo.designpatterns.builder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

public class MotorCycleTest {
    private final Vehicle vehicle = new Vehicle();
    private final MotorCycle motorCycle = new MotorCycle(vehicle);

    @Test
    public void testBodyIsBuild() {
        motorCycle.buildBody();
        LinkedList<String> parts = vehicle.getParts();

        Assertions.assertEquals("This is the body of the motorcycle.", parts.getLast());
    }

    @Test
    public void testWheelsAreAdded() {
        motorCycle.insertWheels();
        LinkedList<String> parts = vehicle.getParts();

        Assertions.assertEquals("2 wheels are added.", parts.getLast());
    }

    @Test
    public void testHeadlightsAreAdded() {
        motorCycle.addHeadlights();
        LinkedList<String> parts = vehicle.getParts();

        Assertions.assertEquals("1 headlight is added.", parts.getLast());
    }
}
