/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.String;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ReverseVowelTest {
    ReverseVowel fixture;

    @BeforeEach
    public void setUp() {
        fixture = new ReverseVowel();
    }

    @Test
    public void reverseVowels() {
        assertEquals("leotcede", fixture.reverseVowels("leetcode"));
    }

}
