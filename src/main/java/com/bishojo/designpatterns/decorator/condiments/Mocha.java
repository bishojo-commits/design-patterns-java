package com.bishojo.designpatterns.decorator.condiments;

import com.bishojo.designpatterns.decorator.beverages.Beverage;

public class Mocha extends CondimentDecorator{

    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return this.beverage.cost() + 0.10;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription().concat(", Mocha");
    }
}
