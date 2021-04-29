package com.bishojo.designpatterns.strategy.test;

import com.bishojo.designpatterns.strategy.behaviour.quack.Quack;
import com.bishojo.designpatterns.test.helpers.AbstractStreamTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import static org.mockito.Mockito.*;

public class QuackTest extends AbstractStreamTest {

    private final Quack quack = spy(Quack.class);

    @Test
    public void testCanQuack() {
        quack.quack();
        Assertions.assertEquals("I quack!", outContent.toString().trim());
    }

    @Test
    public void testQuackMethodCalled() {
        quack.quack();
        verify(quack).quack();
    }

    @Test
    public void testQuackMethodCalled2Times() {
        quack.quack();
        quack.quack();

        verify(quack, times(2)).quack();
    }
}
