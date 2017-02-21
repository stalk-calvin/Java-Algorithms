/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.String;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ReverseVowelTest {
    ReverseVowel fixture;

    @Before
    public void setUp() {
        fixture = new ReverseVowel();
    }

    @Test
    public void reverseVowels() {
        assertEquals("leotcede", fixture.reverseVowels("leetcode"));
    }

}
