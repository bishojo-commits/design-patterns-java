package com.bishojo.designpatterns.decorator;

import com.bishojo.designpatterns.decorator.beverages.Espresso;
import com.bishojo.designpatterns.decorator.condiments.Mocha;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MochaTest {
    private final Espresso espresso = new Espresso();
    private final Mocha mocha = new Mocha(espresso);

    @Test
    public void testDescriptionIsExpanded() {
        Assertions.assertEquals(mocha.getDescription(), "Espresso, Mocha");
    }

    @Test
    public void testCostOfMochaIsAdded() {
        Assertions.assertEquals(mocha.cost(), 2.09);
    }
}
