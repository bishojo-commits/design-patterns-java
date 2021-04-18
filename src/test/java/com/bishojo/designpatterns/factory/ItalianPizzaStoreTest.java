package com.bishojo.designpatterns.factory;

import com.bishojo.designpatterns.factory.exception.PizzaNotFoundException;
import com.bishojo.designpatterns.factory.pizza.*;
import com.bishojo.designpatterns.factory.store.ItalianStylePizzaStore;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ItalianPizzaStoreTest {
    private final ItalianStylePizzaStore store = new ItalianStylePizzaStore();

    @Test
    @DisplayName("cheesePizzaCreated")
    public void testCheesePizzaCreated()
    {
        Pizza pizza = store.createPizza("cheese");

        Assertions.assertEquals(pizza.getName(), "ItalianCheesePizza");
        Assertions.assertTrue(pizza instanceof CheesePizza);
    }

    @Test
    @DisplayName("pepperoniPizzaCreated")
    public void testPepperoniPizzaCreated()
    {
        Pizza pizza = store.createPizza("pepperoni");

        Assertions.assertEquals(pizza.getName(), "ItalianPepperoniPizza");
        Assertions.assertTrue(pizza instanceof PepperoniPizza);
    }

    @Test
    @DisplayName("clamPizzaCreated")
    public void testClamPizzaCreated()
    {
        Pizza pizza = store.createPizza("clam");

        Assertions.assertEquals(pizza.getName(), "ItalianClamPizza");
        Assertions.assertTrue(pizza instanceof ClamPizza);
    }

    @Test
    @DisplayName("veggiePizzaCreated")
    public void testVeggiePizzaCreated()
    {
        Pizza pizza = store.createPizza("veggie");

        Assertions.assertEquals(pizza.getName(), "ItalianVeggiePizza");
        Assertions.assertTrue(pizza instanceof VeggiePizza);
    }

    @Test
    @DisplayName("pizzaNotFoundExceptionThrown")
    public void testPizzaNotFoundExceptionThrown()
    {
        RuntimeException exception = Assertions.assertThrows(PizzaNotFoundException.class,
                () ->  store.createPizza("no pizza"));

        Assertions.assertEquals(exception.getMessage(), "Pizza type not found 🍕");
    }
}
