package org.calvin.DesignPatterns.Creational.Builder.Hierarchical;

import org.junit.Test;

import static org.calvin.DesignPatterns.Creational.Builder.Hierarchical.Pizza.Topping.*;
import static org.calvin.DesignPatterns.Creational.Builder.Hierarchical.Pizza.Size.*;
import static org.junit.Assert.assertEquals;

public class PizzaTest {
    @Test
    public void shouldMakeDifferentPizzas() {
        NyPizza pizza = new NyPizza.Builder(SMALL)
                .addTopping(SAUSAGE).addTopping(ONION).build();
        VeggiePizza vPizza = new VeggiePizza.Builder(MEDIUM)
                .addTopping(HAM).addVeggies(VeggiePizza.Veggie.MUSHROOM).build();
        assertEquals("New York Pizza with [ONION, SAUSAGE], Size: SMALL", pizza.toString());
        assertEquals("VeggiePizza with [HAM], Size: MEDIUM, Veggies: [MUSHROOM]", vPizza.toString());
    }
}