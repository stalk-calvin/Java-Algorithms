/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.String;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class IsomorphicTest {
    Isomorphic fixture;

    @Before
    public void setUp() {
        fixture = new Isomorphic();
    }

    @Test
    public void shouldBeIsomorphic() {
        assertTrue(fixture.isIsomorphic("paper", "title"));
    }

    @Test
    public void shouldNotBeIsomorphic() {
        assertFalse(fixture.isIsomorphic("foo", "bar"));
    }

    @Test
    public void shouldNotBeIsomorphicMissingLatter() {
        assertFalse(fixture.isIsomorphic("for", "baa"));
    }

    @Test
    public void shouldNotBeIsomorphicOnDifferentLength() {
        assertFalse(fixture.isIsomorphic("faceis", "ugly"));
    }

}
