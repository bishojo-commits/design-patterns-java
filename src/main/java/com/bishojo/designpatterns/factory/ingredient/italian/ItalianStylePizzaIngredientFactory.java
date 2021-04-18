package com.bishojo.designpatterns.factory.ingredient.italian;

import com.bishojo.designpatterns.factory.ingredient.*;

public class ItalianStylePizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new CheesyCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new TomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new Gorgonzola();
    }

    @Override
    public Veggie[] createVeggies() {
        Veggie[] veggies = {new Spinach(), new RedOnion()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new HotPepperoni();
    }

    @Override
    public Clam createClam() {
        return new Mussel();
    }
}
