/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.String;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LongestCommonPrefixTest {
    LongestCommonPrefix fixture;

    @BeforeEach
    public void setUp() {
        fixture = new LongestCommonPrefix();
    }

    @Test
    public void shouldFindLongestCommonPrefix() {
        String[] input = {"jewgfsdasda", "jewgfsjwurf", "jew?ASD"};
        assertEquals("jew", fixture.longestCommonPrefix(input));
    }

}
