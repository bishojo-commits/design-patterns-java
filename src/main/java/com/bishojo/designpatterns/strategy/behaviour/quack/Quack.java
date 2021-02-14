package com.bishojo.designpatterns.strategy.behaviour.quack;

public class Quack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("I quack!");
    }
}
