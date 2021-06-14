package com.bishojo.designpatterns.prototype;

import com.bishojo.designpatterns.prototype.dance_styles.LatinDance;
import com.bishojo.designpatterns.prototype.dance_styles.StreetDance;
import com.bishojo.designpatterns.prototype.dance_styles.DanceStyle;
import com.bishojo.designpatterns.prototype.dance_styles.AfricanDance;
import com.bishojo.designpatterns.prototype.exception.DanceStyleNotFoundException;

import java.util.Hashtable;

public class DanceStyleCache {

    private static Hashtable<String, DanceStyle> danceStyleMap = new Hashtable<>();

    public static DanceStyle getDanceStyle(String id) {
        DanceStyle danceStyle = danceStyleMap.get(id);
        //clone
        if (danceStyle != null) {
            return danceStyle.clone();
        } else {
            throw new DanceStyleNotFoundException("Dance Style not found 💃🏼");
        }
    }

    public static void loadCache() {
        DanceStyle africanDance = new AfricanDance();
        africanDance.setId("1");
        danceStyleMap.put(africanDance.getId(), africanDance);

        DanceStyle latinDance = new LatinDance();
        latinDance.setId("2");
        danceStyleMap.put(latinDance.getId(), latinDance);

        DanceStyle streetDance = new StreetDance();
        streetDance.setId("3");
        danceStyleMap.put(streetDance.getId(), streetDance);
    }

    public static Hashtable<String, DanceStyle> getDanceStyleMap() {
        return danceStyleMap;
    }
}
