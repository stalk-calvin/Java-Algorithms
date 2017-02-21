/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.String;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class UniqueCharsTest {
    private UniqueChars fixture;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Before
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
    public void shouldNotHaveUniqueCharsWithNullInput() throws Exception {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("You can't pass a null input as argument.");
        fixture.hasUniqueChars(null);
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
    public void shouldASCIINotHaveUniqueCharsWithNullInput() throws Exception {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("You can't pass a null input as argument.");
        fixture.hasASCIIUniqueChars(null);
    }
}
