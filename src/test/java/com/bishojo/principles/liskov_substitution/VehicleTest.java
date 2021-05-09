package com.bishojo.principles.liskov_substitution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VehicleTest {
    private final Vehicle bus = new Bus();
    private final Vehicle car = new Car();

    @Test
    public void objectsOfSameSuperTypeAndDifferentSubTypeCanBeReplacedWithoutBreaking() {
        Vehicle vehicle = bus;
        int speedBus = vehicle.getSpeed();
        vehicle = car;
        int speedCar = vehicle.getSpeed();

        Assertions.assertNotEquals(speedBus, speedCar);
    }
}
