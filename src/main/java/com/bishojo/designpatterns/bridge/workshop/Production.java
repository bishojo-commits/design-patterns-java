package com.bishojo.designpatterns.bridge.workshop;

public class Production extends Workshop {
    @Override
    public void work() {
        System.out.println("Produced.");
    }
}
