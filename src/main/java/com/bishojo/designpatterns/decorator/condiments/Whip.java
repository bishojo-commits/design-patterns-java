package com.bishojo.designpatterns.decorator.condiments;


import com.bishojo.designpatterns.decorator.beverages.Beverage;

public class Whip extends CondimentDecorator {

    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.20;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription().concat(", Whip");
    }
}
