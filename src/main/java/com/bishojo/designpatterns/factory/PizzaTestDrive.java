package com.bishojo.designpatterns.factory;

import com.bishojo.designpatterns.factory.pizza.Pizza;
import com.bishojo.designpatterns.factory.store.ItalianStylePizzaStore;
import com.bishojo.designpatterns.factory.store.PizzaStore;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore italian = new ItalianStylePizzaStore();
        Pizza pizza = italian.orderPizza("cheese");

        System.out.println(pizza.toString());
    }
}
