package com.bishojo.designpatterns.strategy.test;

import com.bishojo.designpatterns.strategy.behaviour.quack.MuteQuack;
import com.bishojo.designpatterns.test.helpers.AbstractStreamTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import static org.mockito.Mockito.*;

public class MuteQuackTest extends AbstractStreamTest {

    private final MuteQuack muteQuack = spy(MuteQuack.class);

    @Test
    public void testCanNotQuack() {
        muteQuack.quack();
        Assertions.assertEquals("I can't quack!", outContent.toString().trim());
    }

    @Test
    public void testQuackMethodCalled() {
        muteQuack.quack();
        verify(muteQuack).quack();
    }

    @Test
    public void testQuackMethodCalledOneTime() {
        muteQuack.quack();
        muteQuack.quack();

        verify(muteQuack, times(2)).quack();
    }
}
