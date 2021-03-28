package com.bishojo.designpatterns.strategy.test;

import com.bishojo.designpatterns.strategy.behaviour.quack.Squeak;
import com.bishojo.designpatterns.test.helpers.AbstractStreamTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import static org.mockito.Mockito.*;

public class SqueakTest extends AbstractStreamTest {

    private final Squeak squeak = spy(Squeak.class);

    @Test
    public void testCanSqueak() {
        squeak.quack();
        Assertions.assertEquals("I squeak!", outContent.toString().trim());
    }

    @Test
    public void testQuackMethodCalled()
    {
        squeak.quack();
        verify(squeak).quack();
    }

    @Test
    public void testQuackMethodCalledOneTime()
    {
        squeak.quack();
        squeak.quack();

        verify(squeak, times(2)).quack();
    }
}
