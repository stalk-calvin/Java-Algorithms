/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.DesignPatterns.Creational.Builder;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NutritionFactsLombokTest {
    NutritionFactsLombok fixture;

    @Test
    public void shouldCreateObjectUsingBuilder() {
        fixture = NutritionFactsLombok.builder().carbohydrate(100).calories(200).fat(100).sodium(50).servings(10)
                .servingSize(5).build();
        String expected = "NutritionFactsLombok(servingSize=5, servings=10, calories=200, fat=100, sodium=50, " +
                "carbohydrate=100)";
        assertEquals(expected, fixture.toString());
    }
}