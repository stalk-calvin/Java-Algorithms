package org.calvin.Arrays;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ProductArrayExceptSelfTest {
    private ProductArrayExceptSelf fixture;

    @Before
    public void setUp() {
        fixture = new ProductArrayExceptSelf();
    }

    @Test
    public void productExceptSelf() throws Exception {
        int[] input = {1,8,7,6,2};
        int[] expected = {672,84,96,112,336};
        int[] result = fixture.productExceptSelf(input);

        assertTrue(Arrays.equals(expected,result));
    }

}