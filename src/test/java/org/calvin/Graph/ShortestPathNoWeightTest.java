package org.calvin.Graph;

import com.google.common.collect.Lists;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.List;

import static org.calvin.Graph.Setup.createUndirectedGraph;
import static org.junit.Assert.assertEquals;

public class ShortestPathNoWeightTest {
    private Graph newGraph;
    private ShortestPathNoWeight fixture;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Before
    public void setUp() throws Exception {
        newGraph = createUndirectedGraph();
    }

    @Test
    public void shouldFindShortestPath() {
        List<String> actual = ShortestPathNoWeight.shortestPath(newGraph, "A", "F");

        //Compare the result with ShortestPath with weight
        List<String> expected = Lists.newArrayList("A", "B", "F");

        assertEquals(expected, actual);
    }

    @Test
    public void shouldFindItself() {
        List<String> actual = ShortestPathNoWeight.shortestPath(newGraph, "A", "A");

        List<String> expected = Lists.newArrayList("A");

        assertEquals(expected, actual);
    }
}