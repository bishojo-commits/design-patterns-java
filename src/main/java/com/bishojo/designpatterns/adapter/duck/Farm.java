package com.bishojo.designpatterns.adapter.duck;

public class Farm {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        Turkey turkey = new WildTurkey();
        Duck adaptedTurkey = new TurkeyAdapter(turkey);

        duck.fly();
        duck.quack();

        adaptedTurkey.fly();
        adaptedTurkey.quack();
    }
}
