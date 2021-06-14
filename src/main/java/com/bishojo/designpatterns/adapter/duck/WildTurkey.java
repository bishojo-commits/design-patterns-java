package com.bishojo.designpatterns.adapter.duck;

public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        int i = 0;

        while (i <= 2) {
            System.out.println("I am flying");
            i++;
        }
    }
}

