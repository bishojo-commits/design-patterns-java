package com.bishojo.designpatterns.strategy.test;

import com.bishojo.designpatterns.strategy.behaviour.fly.FlyRocketPower;
import com.bishojo.helpers.AbstractStreamTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class FlyRocketPowerTest extends AbstractStreamTest {

    private final FlyRocketPower fly = spy(FlyRocketPower.class);

    @Test
    public void testCanFly() {
        fly.fly();
        Assertions.assertEquals("I fly with rocket power!", outContent.toString().trim());
    }

    @Test
    public void testFlyMethodCalled() {
        fly.fly();
        verify(fly).fly();
    }

    @Test
    public void testFlyMethodCalled2Times() {
        fly.fly();
        fly.fly();

        verify(fly, times(2)).fly();
    }
}
