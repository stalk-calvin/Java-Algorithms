package org.calvin.Graph;

import com.google.common.collect.Lists;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class TopologicalSortTest {
    private Graph g;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Before
    public void setUp() throws Exception {
        g = Setup.createDAG();
    }

    @Test
    public void shouldTopologicalSort() throws Exception {
        List<String> actual = TopologicalSort.sort(g);
        List<String> expected = Lists.newArrayList("A","B","C","D","E","F");
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotTopologicalSortCyclicGraph() throws Exception {
        expectedException.expect(Exception.class);
        expectedException.expectMessage("Graph has a cycle!");
        g.getNode("C").addEdge(g.getNode("C"), 2);
        List<String> actual = TopologicalSort.sort(g);
        List<String> expected = Lists.newArrayList("A","B","C","D","E","F");
        assertEquals(expected, actual);
    }
}