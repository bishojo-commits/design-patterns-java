package com.bishojo.designpatterns.strategy.behaviour.quack;

public class MuteQuack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("I can't quack!");
    }
}
