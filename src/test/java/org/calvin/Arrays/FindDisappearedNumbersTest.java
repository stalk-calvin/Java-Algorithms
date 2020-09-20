/*
 * Copyright Calvin Lee Since 2017.
 * All Rights Reserved.
 */

package org.calvin.Arrays;

import com.google.common.collect.Lists;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindDisappearedNumbersTest {
    private FindDisappearedNumbers fixture;

    @Before public void setUp() throws Exception {
        fixture = new FindDisappearedNumbers();
    }

    @Test public void shouldFindAllMissingNumbers() {
        int[] input = {-2, -7, 4, 3, 2, -3, 7, 8, 2, -4, 3, 1, -6};
        assertEquals(Lists.newArrayList(-5, -1, 0, 5, 6), fixture.findDisappearedNumbers(input));
    }
}
