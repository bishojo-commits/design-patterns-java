package com.bishojo.designpatterns.decorator.condiments;

import com.bishojo.designpatterns.decorator.beverages.Beverage;

public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
