package com.bishojo.designpatterns.strategy.behaviour.fly;

public class FlyRocketPower implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I fly with rocket power!");
    }
}
