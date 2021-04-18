package com.bishojo.designpatterns.factory;

import com.bishojo.designpatterns.factory.ingredient.Veggie;
import com.bishojo.designpatterns.factory.ingredient.italian.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class ItalianStylePizzaIngredientFactoryTest {
    private final ItalianStylePizzaIngredientFactory ingredientFactory = spy(ItalianStylePizzaIngredientFactory.class);

    @Test
    public void testDoughCreated()
    {
        Assertions.assertTrue(ingredientFactory.createDough() instanceof CheesyCrustDough);
    }

    @Test
    public void testSauceCreated()
    {
        Assertions.assertTrue(ingredientFactory.createSauce() instanceof TomatoSauce);
    }

    @Test
    public void testCheeseCreated()
    {
        Assertions.assertTrue(ingredientFactory.createCheese() instanceof Gorgonzola);
    }

    @Test
    public void testClamCreated()
    {
        Assertions.assertTrue(ingredientFactory.createClam() instanceof Mussel);
    }

    @Test
    public void testPepperoniCreated()
    {
        Assertions.assertTrue(ingredientFactory.createPepperoni() instanceof HotPepperoni);
    }

    @Test
    public void testVeggiesCreated()
    {
        Veggie[] veggies = ingredientFactory.createVeggies();

        Assertions.assertTrue(veggies[0] instanceof Spinach);
        Assertions.assertTrue(veggies[1] instanceof RedOnion);
    }
}
