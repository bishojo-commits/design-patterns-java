package com.bishojo.designpatterns.strategy;

import com.bishojo.designpatterns.strategy.behaviour.fly.FlyRocketPower;
import com.bishojo.designpatterns.strategy.behaviour.quack.Squeak;
import com.bishojo.designpatterns.strategy.duck.Duck;
import com.bishojo.designpatterns.strategy.duck.MallardDuck;
import com.bishojo.designpatterns.strategy.duck.RubberDuck;

public class MiniDuckSimulator {
    public static void main (String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck rubber = new RubberDuck();
        rubber.swim();
        rubber.performQuack();
        rubber.performFly();

        rubber.setFlyBehaviour(new FlyRocketPower());
        rubber.setQuackBehaviour(new Squeak());

        rubber.performQuack();
        rubber.performFly();
    }
}
