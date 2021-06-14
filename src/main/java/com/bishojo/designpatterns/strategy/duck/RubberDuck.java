package com.bishojo.designpatterns.strategy.duck;

import com.bishojo.designpatterns.strategy.behaviour.fly.FlyNoWay;
import com.bishojo.designpatterns.strategy.behaviour.quack.Quack;

public class RubberDuck extends Duck {
    public RubberDuck() {
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Quack();
    }

    public void display() {
        System.out.println("I'm a real Rubber Duck");
    }
}
