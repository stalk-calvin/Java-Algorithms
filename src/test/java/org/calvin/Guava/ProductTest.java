package org.calvin.Guava;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class ProductTest {
    private List<Product> fixture;

    @Before
    public void setUp() throws Exception {
        fixture = new ArrayList<>();
        createProducts();
    }

    @Test
    public void shouldBeEqual() throws Exception {
        List<Product> expectedBefore = new ArrayList<>();
        expectedBefore.add(new Product("a", "c"));
        expectedBefore.add(new Product("c", "e"));
        expectedBefore.add(new Product("a", "d"));
        assertEquals(expectedBefore, fixture);

        Collections.sort(fixture);

        List<Product> expectedAfter = new ArrayList<>();
        expectedAfter.add(new Product("a", "c"));
        expectedAfter.add(new Product("a", "d"));
        expectedAfter.add(new Product("c", "e"));
        assertEquals(expectedAfter, fixture);
    }

    private void createProducts() {
        char alpha = 'a';
        char newAlpha = alpha;
        int incre = 1;
        for (int i = 0; i < 3; i++) {
            if (i == 2) {
                newAlpha = alpha;
                incre = 2;
            }
            String name = Character.toString(newAlpha++);
            newAlpha += incre;
            String description = Character.toString(newAlpha);
            fixture.add(new Product(name, description));
        }
    }
}