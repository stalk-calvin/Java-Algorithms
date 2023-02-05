/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.String;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimplifyPathTest {
    private SimplifyPath fixture;

    @BeforeEach
    public void setUp() throws Exception {
        fixture = new SimplifyPath();
    }

    @Test
    public void shouldSimplifyPath() throws Exception {
        String input = "/a/./b/../../c/";
        String actual = fixture.simplifyPath(input);
        assertEquals("/c", actual);
    }

}
