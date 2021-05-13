package com.bishojo.designpatterns.prototype;

import com.bishojo.designpatterns.prototype.dance_styles.DanceStyle;

public class DanceInstitute {
    public static void main(String[] args) {
        DanceStyleCache.loadCache();

        DanceStyle dance = DanceStyleCache.getDanceStyle("2");
        System.out.println("Dance of Type: " + dance.getType());

        dance.createDancer();
    }
}
