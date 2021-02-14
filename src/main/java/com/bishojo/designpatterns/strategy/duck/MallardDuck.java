package com.bishojo.designpatterns.strategy.duck;

import com.bishojo.designpatterns.strategy.behaviour.fly.FlyWithWings;
import com.bishojo.designpatterns.strategy.behaviour.quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
    }

    public void display() {
        System.out.println("I'm a real Mallard Duck");
    }
}
