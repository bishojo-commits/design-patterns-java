package com.bishojo.designpatterns.strategy.test;

import com.bishojo.designpatterns.strategy.behaviour.quack.MuteQuack;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.mockito.Mockito.*;

public class MuteQuackTest {

    private final MuteQuack muteQuack = spy(MuteQuack.class);
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testCanQuack() {
        muteQuack.quack();
        Assertions.assertEquals("I can't quack!", outContent.toString().trim());
    }

    @Test
    public void testQuackMethodCalled()
    {
        muteQuack.quack();
        verify(muteQuack).quack();
    }

    @Test
    public void testQuackMethodCalledOneTime()
    {
        muteQuack.quack();
        muteQuack.quack();

        verify(muteQuack, times(2)).quack();
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }
}
