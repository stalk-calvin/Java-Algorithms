package org.calvin.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;

public class ProductArrayExceptSelfTest {
    private ProductArrayExceptSelf fixture;

    @BeforeEach
    public void setUp() {
        fixture = new ProductArrayExceptSelf();
    }

    @Test
    public void productExceptSelf() throws Exception {
        int[] input = {1,8,7,6,2};
        int[] expected = {672,84,96,112,336};
        int[] result = fixture.productExceptSelf(input);

        assertArrayEquals(expected, result);
    }

    @Test
    public void productExceptSelfAnother() throws Exception {
        int[] input = {1,2,3,4};
        int[] expected = {24,12,8,6};
        int[] result = fixture.productExceptSelfOneArr(input);

        assertArrayEquals(expected, result);
    }
}