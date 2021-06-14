package com.bishojo.designpatterns.prototype;

import com.bishojo.designpatterns.prototype.dance_styles.AfricanDance;
import com.bishojo.designpatterns.prototype.dance_styles.DanceStyle;
import com.bishojo.helpers.AbstractStreamTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AfricanDanceTest extends AbstractStreamTest {

    private final DanceStyle dance = new AfricanDance();

    @Test
    public void testTypeIsSetOnInitialization() {
        Assertions.assertEquals(dance.getType(), "African");
    }

    @Test
    public void testDancerIsCreated() {
        dance.createDancer();

        Assertions.assertEquals(
                "Creating dancer with dance style " + dance.getType(),
                outContent.toString().trim()
        );
    }
}
