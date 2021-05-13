package com.bishojo.designpatterns.prototype.dance_styles;

public class StreetDance extends DanceStyle {
    public StreetDance() {
        this.type = "Street";
    }

    @Override
    public void createDancer() {
        System.out.println("Creating dancer with dance style " + type);
    }
}
