package com.bishojo.designpatterns.prototype.dance_styles;

public class AfricanDance extends DanceStyle {
    public AfricanDance() {
        this.type = "African";
    }

    @Override
    public void createDancer() {
        System.out.println("Creating dancer with dance style " + type);
    }
}
