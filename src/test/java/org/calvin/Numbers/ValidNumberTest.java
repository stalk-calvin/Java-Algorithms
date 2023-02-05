/*
 * Copyright Calvin Lee Since 2017.
 * All Rights Reserved.
 */

package org.calvin.Numbers;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ValidNumberTest {
    ValidNumber fixture;

    @BeforeEach
    public void setUp() {
        fixture = new ValidNumber();
    }

    @Test public void shouldBeNaturalANumber() throws Exception {
        assertTrue(fixture.isNumber("0"));
    }

    @Test public void shouldBeFloatingANumber() throws Exception {
        assertTrue(fixture.isNumber(" 0.1 "));
    }

    @Test public void shouldBeExponentANumber() throws Exception {
        assertTrue(fixture.isNumber("2e10 "));
    }

    @Test public void shouldBeBlankNotANumber() throws Exception {
        assertFalse(fixture.isNumber("   "));
    }

    @Test public void shouldBeLetterNotANumber() throws Exception {
        assertFalse(fixture.isNumber("abc"));
    }

    @Test public void shouldBeMixedLetterNotANumber() throws Exception {
        assertFalse(fixture.isNumber("1 a"));
    }

    @Test public void shouldBeWithoutRegexNegativeNaturalANumber() throws Exception {
        assertTrue(fixture.isNumberWithoutRegex("-10"));
    }

    @Test public void shouldBeWithoutRegexNaturalANumber() throws Exception {
        assertTrue(fixture.isNumberWithoutRegex("0"));
    }

    @Test public void shouldBeWithoutRegexFloatingANumber() throws Exception {
        assertTrue(fixture.isNumberWithoutRegex(" 0.1 "));
    }

    @Test public void shouldBeWithoutRegexExponentANumber() throws Exception {
        assertTrue(fixture.isNumberWithoutRegex("2e10 "));
    }

    @Test public void shouldBeWithoutRegexExponentWithMultipleE() throws Exception {
        assertFalse(fixture.isNumberWithoutRegex("2ee10 "));
    }

    @Test public void shouldBeWithoutRegexExponentWithPointAfterE() throws Exception {
        assertFalse(fixture.isNumberWithoutRegex("2e.10 "));
    }

    @Test public void shouldBeWithoutRegexBlankNotANumber() throws Exception {
        assertFalse(fixture.isNumberWithoutRegex("   "));
    }

    @Test public void shouldBeWithoutRegexLetterNotANumber() throws Exception {
        assertFalse(fixture.isNumberWithoutRegex("abc"));
    }

    @Test public void shouldBeWithoutRegexWithSignMisplaced() throws Exception {
        assertFalse(fixture.isNumberWithoutRegex("2-10"));
    }

    @Test public void shouldBeWithoutRegexMixedLetterNotANumber() throws Exception {
        assertFalse(fixture.isNumberWithoutRegex("1 a"));
    }
}
