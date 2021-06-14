package com.bishojo.designpatterns.prototype.dance_styles;

public class LatinDance extends DanceStyle {
    public LatinDance() {
        this.type = "Latin";
    }

    @Override
    public void createDancer() {
        System.out.println("Creating dancer with dance style " + type);
    }
}
