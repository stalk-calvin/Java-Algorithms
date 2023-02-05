/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.String;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SimpleRegularExpressionTest {
    private SimpleRegularExpression fixture;

    @BeforeEach
    public void setUp() {
        fixture = new SimpleRegularExpression();
    }

    @Test
    public void shouldNotAcceptNullStringsAsInput() {
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            fixture.evaluate(null, null);
        }, "IllegalArgumentException was expected");

        Assertions.assertEquals("You can't pass a null strings as input", thrown.getMessage());

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