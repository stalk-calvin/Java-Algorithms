/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.DesignPatterns.Builder;

import lombok.AllArgsConstructor;
import lombok.ToString;
import lombok.experimental.Builder;

@AllArgsConstructor
@ToString
@Builder
public class NutritionFactsLombok {
    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;
}