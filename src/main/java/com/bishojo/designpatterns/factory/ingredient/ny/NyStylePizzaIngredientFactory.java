package com.bishojo.designpatterns.factory.ingredient.ny;

import com.bishojo.designpatterns.factory.ingredient.*;

public class NyStylePizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new NapoliSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MeltyCheese();
    }

    @Override
    public Veggie[] createVeggies() {
        Veggie veggies[] = {new Onion(), new Mushroom()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clam createClam() {
        return new Crab();
    }
}
