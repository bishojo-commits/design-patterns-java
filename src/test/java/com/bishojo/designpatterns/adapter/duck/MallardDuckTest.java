package com.bishojo.designpatterns.adapter.duck;

import com.bishojo.helpers.AbstractStreamTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MallardDuckTest extends AbstractStreamTest {

    private final MallardDuck mallardDuck = new MallardDuck();

    @Test
    public void testQuackPerformsQuack() {
        mallardDuck.quack();

        Assertions.assertEquals("Quack", outContent.toString().trim());
    }

    @Test
    public void testFlyPerformsFly() {
        mallardDuck.fly();

        Assertions.assertEquals("I am flying", outContent.toString().trim());
    }
}
