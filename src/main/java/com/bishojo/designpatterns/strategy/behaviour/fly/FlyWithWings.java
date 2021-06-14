package com.bishojo.designpatterns.strategy.behaviour.fly;

public class FlyWithWings implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I Can fly with wings");
    }
}
