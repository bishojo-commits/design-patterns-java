package com.bishojo.designpatterns.factory.pizza;

import com.bishojo.designpatterns.factory.ingredient.PizzaIngredientFactory;

public class CheesePizza extends Pizza {

    private PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing..." + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
