package com.bishojo.designpatterns.factory;

import com.bishojo.designpatterns.factory.ingredient.Veggie;
import com.bishojo.designpatterns.factory.ingredient.ny.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.spy;

public class NyStylePizzaIngredientFactoryTest {
    private final NyStylePizzaIngredientFactory ingredientFactory = spy(NyStylePizzaIngredientFactory.class);

    @Test
    public void testDoughCreated() {
        Assertions.assertTrue(ingredientFactory.createDough() instanceof ThinCrustDough);
    }

    @Test
    public void testSauceCreated() {
        Assertions.assertTrue(ingredientFactory.createSauce() instanceof NapoliSauce);
    }

    @Test
    public void testCheeseCreated() {
        Assertions.assertTrue(ingredientFactory.createCheese() instanceof MeltyCheese);
    }

    @Test
    public void testClamCreated() {
        Assertions.assertTrue(ingredientFactory.createClam() instanceof Crab);
    }

    @Test
    public void testPepperoniCreated() {
        Assertions.assertTrue(ingredientFactory.createPepperoni() instanceof SlicedPepperoni);
    }

    @Test
    public void testVeggiesCreated() {
        Veggie[] veggies = ingredientFactory.createVeggies();

        Assertions.assertTrue(veggies[0] instanceof Onion);
        Assertions.assertTrue(veggies[1] instanceof Mushroom);
    }
}
