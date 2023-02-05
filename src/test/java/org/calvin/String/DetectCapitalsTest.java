/*
 * Copyright Calvin Lee Since 2017.
 * All Rights Reserved.
 */

package org.calvin.String;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DetectCapitalsTest {
    private DetectCapitals fixture;

    @BeforeEach
    public void setUp() {
        fixture = new DetectCapitals();
    }

    @Test
    public void shouldAllCapitalsValidated() throws Exception {
        String input = "USA";
        assertTrue(fixture.detectCapitalUse(input));
    }

    @Test
    public void shouldAllLowerCasedValidated() throws Exception {
        String input = "leetcode";
        assertTrue(fixture.detectCapitalUse(input));
    }

    @Test
    public void shouldFirstLetterUppercaseValidated() throws Exception {
        String input = "Leetcode";
        assertTrue(fixture.detectCapitalUse(input));
    }

    @Test
    public void shouldOneLetterLowerCaseValidated() throws Exception {
        String input = "g";
        assertTrue(fixture.detectCapitalUse(input));
    }

    @Test
    public void shouldOneLetterUpperCaseValidated() throws Exception {
        String input = "G";
        assertTrue(fixture.detectCapitalUse(input));
    }

    @Test
    public void shouldMixedCaseValidated() throws Exception {
        String input = "EEJIHEHEFIEFBBBBaefanfnawjfbawebf";
        assertFalse(fixture.detectCapitalUse(input));
    }

    @Test
    public void shouldLastLetterLowercaseValidated() throws Exception {
        String input = "FFFFFFFf";
        assertFalse(fixture.detectCapitalUse(input));
    }

    @Test
    public void shouldLastLetterUppercaseValidated() throws Exception {
        String input = "ffffffF";
        assertFalse(fixture.detectCapitalUse(input));
    }

}
