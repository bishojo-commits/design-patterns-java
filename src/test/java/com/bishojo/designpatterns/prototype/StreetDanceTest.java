package com.bishojo.designpatterns.prototype;

import com.bishojo.designpatterns.prototype.dance_styles.DanceStyle;
import com.bishojo.designpatterns.prototype.dance_styles.LatinDance;
import com.bishojo.designpatterns.prototype.dance_styles.StreetDance;
import com.bishojo.helpers.AbstractStreamTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StreetDanceTest extends AbstractStreamTest {

    private final DanceStyle dance = new StreetDance();

    @Test
    public void testTypeIsSetOnInitialization() {
        Assertions.assertEquals(dance.getType(), "Street");
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
