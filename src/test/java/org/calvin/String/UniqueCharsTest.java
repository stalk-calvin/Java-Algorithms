/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.String;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UniqueCharsTest {
    private UniqueChars fixture;

    @BeforeEach
    public void setUp() throws Exception {
        fixture = new UniqueChars();
    }

    @Test
    public void shouldHaveUniqueChars() throws Exception {
        boolean actual = fixture.hasUniqueChars("이한성은천재다");
        assertTrue(actual);
    }

    @Test
    public void shouldNotHaveUniqueChars() throws Exception {
        boolean actual = fixture.hasUniqueChars("이한성은성한이");
        assertFalse(actual);
    }

    @Test
    public void shouldNotHaveUniqueCharsWithNullInput() {
        Exception exception =
                assertThrows(IllegalArgumentException.class, () ->
                    fixture.hasUniqueChars(null));
        assertEquals("You can't pass a null input as argument.", exception.getMessage());
    }

    @Test
    public void shouldASCIIHaveUniqueChars() throws Exception {
        boolean actual = fixture.hasASCIIUniqueChars("foxjumped");
        assertTrue(actual);
    }

    @Test
    public void shouldASCIINotHaveUniqueChars() throws Exception {
        boolean actual = fixture.hasASCIIUniqueChars("foobarbaz");
        assertFalse(actual);
    }

    @Test
    public void shouldUniqueNonASCIINotHaveUnique() throws Exception {
        boolean actual = fixture.hasASCIIUniqueChars("이한성은천재다");
        assertFalse(actual);
    }

    @Test
    public void shouldASCIINotHaveUniqueCharsWithNullInput() {
        Exception exception =
                assertThrows(IllegalArgumentException.class, () ->
                    fixture.hasASCIIUniqueChars(null));
        assertEquals("You can't pass a null input as argument.", exception.getMessage());
    }
}
