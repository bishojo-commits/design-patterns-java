package com.bishojo.designpatterns.factory.store;

import com.bishojo.designpatterns.factory.exception.PizzaNotFoundException;
import com.bishojo.designpatterns.factory.ingredient.PizzaIngredientFactory;
import com.bishojo.designpatterns.factory.ingredient.italian.ItalianStylePizzaIngredientFactory;
import com.bishojo.designpatterns.factory.pizza.*;

public class ItalianStylePizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza;
        PizzaIngredientFactory italianIngredientFactory = new ItalianStylePizzaIngredientFactory();

        if (type.equals("cheese")) {
            pizza = new CheesePizza(italianIngredientFactory);
            pizza.setName("ItalianCheesePizza");
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza(italianIngredientFactory);
            pizza.setName("ItalianPepperoniPizza");
        } else if (type.equals("clam")) {
            pizza = new ClamPizza(italianIngredientFactory);
            pizza.setName("ItalianClamPizza");
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza(italianIngredientFactory);
            pizza.setName("ItalianVeggiePizza");
        } else {
            throw new PizzaNotFoundException("Pizza type not found 🍕");
        }

        return pizza;
    }
}
