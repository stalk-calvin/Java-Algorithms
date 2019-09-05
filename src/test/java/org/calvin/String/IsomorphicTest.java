/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.String;

import com.google.common.collect.Lists;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

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

    @Test
    public void shouldGroupIsomorphic() {
        List<String> input = Lists.newArrayList("apple", "apply", "dog", "cog", "romi");
        List<List<String>> actual = fixture.groupIsomorphicStrings(input);
        List<List<String>> expected = Lists.newArrayList(
                Lists.newArrayList("dog", "cog"),
                Lists.newArrayList("romi"),
                Lists.newArrayList("apple", "apply"));

        assertEquals(expected, actual);
    }

}
