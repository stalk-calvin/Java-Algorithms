/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.String;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SimplifyPathTest {
    private SimplifyPath fixture;

    @Before
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
