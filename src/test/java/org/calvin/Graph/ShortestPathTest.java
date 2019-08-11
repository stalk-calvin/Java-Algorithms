package org.calvin.Graph;

import com.google.common.collect.Lists;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.List;

import static org.calvin.Graph.Setup.createUndirectedGraph;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class ShortestPathTest {
    private Graph newGraph;
    private ShortestPath fixture;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Before
    public void setUp() throws Exception {
        newGraph = createUndirectedGraph();
        fixture = new ShortestPath(newGraph);
    }

    @Test
    public void shouldFindShortestPath() throws Exception {
        List<String> actual = fixture.findShortestPath("A", "F");
        List<String> expected = Lists.newArrayList("A", "C", "F");
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotFindShortestPath() throws Exception {
        expectedException.expect(Exception.class);
        expectedException.expectMessage("Invalid start or end!");
        assertNull(fixture.findShortestPath("A", "Z"));
    }
}