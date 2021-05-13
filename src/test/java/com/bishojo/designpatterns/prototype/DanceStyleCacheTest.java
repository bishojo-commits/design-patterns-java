package com.bishojo.designpatterns.prototype;

import com.bishojo.designpatterns.prototype.dance_styles.DanceStyle;
import com.bishojo.designpatterns.prototype.exception.DanceStyleNotFoundException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Hashtable;

public class DanceStyleCacheTest {

    @Test
    public void testCacheLoaded() {
        DanceStyleCache.loadCache();
        Hashtable<String, DanceStyle> danceStyles = DanceStyleCache.getDanceStyleMap();

        Assertions.assertFalse(danceStyles.isEmpty());
    }

    @Test
    public void testDanceStyleCanBeFetched() {
        DanceStyleCache.loadCache();
        Hashtable<String, DanceStyle> danceStyles = DanceStyleCache.getDanceStyleMap();

        DanceStyle danceStyle = danceStyles.get("1");
        Assertions.assertNotNull(danceStyle);
    }

    @Test
    public void testDanceStyleCantBeFetchedThrowsException() {
        DanceStyleCache.loadCache();

        Assertions.assertThrows(
                DanceStyleNotFoundException.class,
                () -> DanceStyleCache.getDanceStyle("7")
        );
    }
}
