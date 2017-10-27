/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.String;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class SimplifyPathTest {
    private SimplifyPath fixture;

    @Before
    public void setUp() throws Exception {
        fixture = new SimplifyPath();
    }

    @Test
    public void simplifyPath() throws Exception {
        String input = "/a/b/../../c/";
        String actual = fixture.simplifyPath(input);
        assertEquals("/c", actual);
    }

}
