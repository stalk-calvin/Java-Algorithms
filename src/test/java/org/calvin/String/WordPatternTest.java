/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.String;

import static junit.framework.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class WordPatternTest {
    WordPattern fixture;

    @Before
    public void setUp() {
        fixture = new WordPattern();
    }

    @Test
    public void shouldHaveWordPattern() {
        assertTrue(fixture.wordPattern("abba","dog cat cat dog"));
    }

    @Test
    public void shouldNotHaveWordPattern() {
        assertFalse(fixture.wordPattern("abba","dog cat cat fish"));
    }

    @Test
    public void shouldNotHaveWordPatternDiffLength() {
        assertFalse(fixture.wordPattern("ab","dog cat cat fish"));
    }

    @Test
    public void shouldNotHaveWordPatternNotFound() {
        assertFalse(fixture.wordPattern("abca","dog cat cat fish"));
    }
}