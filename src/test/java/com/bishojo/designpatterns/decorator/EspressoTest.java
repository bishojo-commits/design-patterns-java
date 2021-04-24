package com.bishojo.designpatterns.decorator;

import com.bishojo.designpatterns.decorator.beverages.Espresso;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EspressoTest {

    private final Espresso espresso = new Espresso();

    @Test
    public void testDescriptionIsSetOnInitilization() {
        Assertions.assertEquals(espresso.getDescription(), "Espresso");
    }

    @Test
    public void testCostSet() {
        Assertions.assertEquals(espresso.cost(), 1.99);
    }
}
