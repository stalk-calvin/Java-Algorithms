/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.String;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class LongestCommonPrefixTest {
    LongestCommonPrefix fixture;

    @Before
    public void setUp() {
        fixture = new LongestCommonPrefix();
    }

    @Test
    public void shouldFindLongestCommonPrefix() {
        String[] input = {"jewgfsdasda", "jewgfsjwurf", "jew?ASD"};
        assertEquals("jew", fixture.longestCommonPrefix(input));
    }

}
