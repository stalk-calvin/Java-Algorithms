/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.String;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WordPatternTest {
    private WordPattern fixture;

    @BeforeEach
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
