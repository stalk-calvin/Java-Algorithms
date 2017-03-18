/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.String;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class SimpleRegularExpressionTest {
    private SimpleRegularExpression fixture;

    @Before
    public void setUp() {
        fixture = new SimpleRegularExpression();
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldNotAcceptNullStringsAsInput() {
        fixture.evaluate(null, null);
    }

    @Test public void shouldReturnFalseIfInputDoesNotMatchesAndDoesNotContainKeyElements() {
        String input = "aaa";
        String regularExpression = "a";

        boolean result = fixture.evaluate(input, regularExpression);

        assertFalse(result);
    }

    @Test public void shouldReturnTrueIfInputMatchesAndDoesNotContainKeyElements() {
        String input = "aaa";
        String regularExpression = "aaa";

        boolean result = fixture.evaluate(input, regularExpression);

        assertTrue(result);
    }

    @Test public void shouldReturnTrueIfMatchesUsingAsterisk() {
        String input = "aaa";
        String regularExpression = "a*";

        boolean result = fixture.evaluate(input, regularExpression);

        assertTrue(result);
    }

    @Test public void shouldReturnFalseIfDoesNotMatchUsingAsterisk() {
        String input = "aaa";
        String regularExpression = "b*";

        boolean result = fixture.evaluate(input, regularExpression);

        assertFalse(result);
    }

    @Test public void shouldReturnTrueIfMatchesUsingDot() {
        String input = "aa";
        String regularExpression = "a.";

        boolean result = fixture.evaluate(input, regularExpression);

        assertTrue(result);
    }

    @Test public void shouldReturnFalseIfDoesNotMatchUsingDot() {
        String input = "aaa";
        String regularExpression = "a.";

        boolean result = fixture.evaluate(input, regularExpression);

        assertFalse(result);
    }

    @Test public void shouldReturnTrueIfMatchesUsingAsteriskAndDot() {
        String input = "aaa";
        String regularExpression = ".a*";

        boolean result = fixture.evaluate(input, regularExpression);

        assertTrue(result);
    }

    @Test public void shouldReturnFalseIfDoesNotMatchUsingAsteriskAndDot() {
        String input = "aaa";
        String regularExpression = ".b*";

        boolean result = fixture.evaluate(input, regularExpression);

        assertFalse(result);
    }
}