/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.StackQueue;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ValidParenthesesTest {
    ValidParentheses fixture;

    @BeforeEach
    public void setUp() {
        fixture = new ValidParentheses();
    }

    @Test
    public void shouldBeValid() {
        assertTrue(fixture.isValid("([{}])"));
    }

    @Test
    public void shouldNotBeValidWhenStringClosingRoundBracket() {
        assertFalse(fixture.isValid(")("));
    }

    @Test
    public void shouldNotBeValidWhenStringClosingSquareBracket() {
        assertFalse(fixture.isValid("]["));
    }

    @Test
    public void shouldNotBeValidWhenStringClosingCurlyBracket() {
        assertFalse(fixture.isValid("}{"));
    }

    @Test
    public void shouldNotBeValidWhenStringIsEmpty() {
        assertFalse(fixture.isValid(""));
    }
}
