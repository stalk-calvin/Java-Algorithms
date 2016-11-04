package org.calvin.StackQueue;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class ValidParenthesesTest {
    ValidParentheses fixture;

    @Before
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