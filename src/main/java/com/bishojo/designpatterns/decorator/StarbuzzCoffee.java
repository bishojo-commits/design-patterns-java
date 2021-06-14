package com.bishojo.designpatterns.decorator;

import com.bishojo.designpatterns.decorator.beverages.Beverage;
import com.bishojo.designpatterns.decorator.beverages.Espresso;
import com.bishojo.designpatterns.decorator.condiments.Mocha;
import com.bishojo.designpatterns.decorator.condiments.Whip;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage espresso = new Espresso();

        System.out.println(
                "One " + espresso.getDescription() + " costs " + espresso.cost() + "USD"
        );

        Mocha mocha = new Mocha(espresso);
        Mocha mochaDouble = new Mocha(mocha);
        Whip whip = new Whip(mochaDouble);

        System.out.println(
                "One " + whip.getDescription() + " costs " + whip.cost() + "USD"
        );
    }
}
