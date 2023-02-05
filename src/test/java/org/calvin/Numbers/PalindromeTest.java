/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Numbers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeTest {
    Palindrome fixture;

    @BeforeEach
    public void setUp() {
        fixture = new Palindrome();
    }

    @Test
    public void shouldBePalindrome() {
        assertTrue(fixture.isPalindrome(12321));
    }

}
