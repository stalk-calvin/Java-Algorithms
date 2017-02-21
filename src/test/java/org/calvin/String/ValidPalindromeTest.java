/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.String;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class ValidPalindromeTest {
    ValidPalindrome fixture;

    @Before
    public void setUp() {
        fixture = new ValidPalindrome();
    }

    @Test
    public void shouldFindPalindrome() {
        assertTrue(fixture.isPalindrome("abcdedcba"));
    }

}
