/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Guava;

import com.google.common.collect.Lists;
import org.junit.Before;
import org.junit.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ProductTest {
    private List<Product> fixture;

    @Before
    public void setUp() throws Exception {
        fixture = Lists.newArrayList(
                new Product("g", "x"),
                new Product("d", "m"),
                new Product("d", "c"),
                new Product("w", "c")
        );
    }

    @Test
    public void shouldBeEqual() throws Exception {
        List<Product> expectedBefore = Lists.newArrayList(
            new Product("g", "x"),
            new Product("d", "m"),
            new Product("d", "c"),
            new Product("w", "c")
        );
        assertEquals(expectedBefore, fixture);

        Collections.sort(fixture);

        List<Product> expectedAfter = Lists.newArrayList(
            new Product("d", "c"),
            new Product("d", "m"),
            new Product("g", "x"),
            new Product("w", "c")
        );
        assertEquals(expectedAfter, fixture);
    }

    @Test
    public void shouldGiveRightComparison() {
        List<Product> actual = Lists.newArrayList(
                new Product("a", "b"),
                new Product("b", "b"),
                new Product("c", "a"),
                new Product("a", "d"),
                new Product("a", "b"),
                new Product(null, null)
        );
        Collections.sort(actual);
        List<Product> expected = Lists.newArrayList(
                new Product(null, null),
                new Product("a", "b"),
                new Product("a", "b"),
                new Product("a", "d"),
                new Product("b", "b"),
                new Product("c", "a")
        );
        assertEquals(expected.toString(), actual.toString());
    }

}
