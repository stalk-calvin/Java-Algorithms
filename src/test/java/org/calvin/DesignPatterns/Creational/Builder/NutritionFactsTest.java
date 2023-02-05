/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.DesignPatterns.Creational.Builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NutritionFactsTest {
    NutritionFacts fixture;

    @Test
    public void shouldCreateObjectUsingBuilder() {
        fixture = new NutritionFacts.Builder(5, 10).calories(200).fat(100).carbohydrate(100).sodium(50).build();
        String expected = "NutritionFacts{servingSize=5, servings=10, calories=200, fat=100, sodium=50, carbohydrate=100}";
        assertEquals(expected, fixture.toString());
    }

}
