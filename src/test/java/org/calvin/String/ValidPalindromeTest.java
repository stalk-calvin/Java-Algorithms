/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.String;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ValidPalindromeTest {
    ValidPalindrome fixture;

    @BeforeEach
    public void setUp() {
        fixture = new ValidPalindrome();
    }

    @Test
    public void shouldFindPalindrome() {
        assertTrue(fixture.isPalindrome("abcdedcba"));
    }

}
