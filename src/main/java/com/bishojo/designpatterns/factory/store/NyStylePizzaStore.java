package com.bishojo.designpatterns.factory.store;

import com.bishojo.designpatterns.factory.exception.PizzaNotFoundException;
import com.bishojo.designpatterns.factory.ingredient.PizzaIngredientFactory;
import com.bishojo.designpatterns.factory.ingredient.ny.NyStylePizzaIngredientFactory;
import com.bishojo.designpatterns.factory.pizza.*;

public class NyStylePizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza;
        PizzaIngredientFactory nyIngredientFactory = new NyStylePizzaIngredientFactory();

        if (type.equals("cheese")) {
            pizza = new CheesePizza(nyIngredientFactory);
            pizza.setName("NyCheesePizza");
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza(nyIngredientFactory);
            pizza.setName("NyPepperoniPizza");
        } else if (type.equals("clam")) {
            pizza = new ClamPizza(nyIngredientFactory);
            pizza.setName("NyClamPizza");
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza(nyIngredientFactory);
            pizza.setName("NyVeggiePizza");
        } else {
            throw new PizzaNotFoundException("Pizza type not found 🍕");
        }

        return pizza;
    }
}
