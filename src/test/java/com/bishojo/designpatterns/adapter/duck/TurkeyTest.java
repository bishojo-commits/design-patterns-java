package com.bishojo.designpatterns.adapter.duck;

import com.bishojo.helpers.AbstractStreamTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TurkeyTest extends AbstractStreamTest {

    private final WildTurkey wildTurkey = new WildTurkey();

    @Test
    public void testGobblePerformsGobble() {
        wildTurkey.gobble();

        Assertions.assertEquals("Gobble gobble", outContent.toString().trim());
    }

    @Test
    public void testFlyPerformsFly() {
        wildTurkey.fly();

        Assertions.assertEquals(
                "I am flying\nI am flying\nI am flying",
                outContent.toString().trim()
        );
    }
}
