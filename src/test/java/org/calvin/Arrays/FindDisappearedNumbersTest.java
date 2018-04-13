/*
 * Copyright Calvin Lee Since 2017.
 * All Rights Reserved.
 */

package org.calvin.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.google.common.collect.Lists;
import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;

public class FindDisappearedNumbersTest {
    private FindDisappearedNumbers fixture;

    @Before public void setUp() throws Exception {
        fixture = new FindDisappearedNumbers();
    }

    @Test public void shouldFindAllMissingNumbers() {
        int[] input = {4, 3, 2, 7, 8, 2, 3, 1};
        assertEquals(Lists.newArrayList(5, 6), fixture.findDisappearedNumbers(input));
    }

    @Test public void shouldFindAllMissingNumbersNoExtraSpace() {
        int[] input = {4, 3, 2, 7, 8, 2, 3, 1};
        assertTrue(Arrays.equals(new int[]{5, 6}, fixture.findDisappearedNumbersNoExtraSpace(input)));
    }
}
