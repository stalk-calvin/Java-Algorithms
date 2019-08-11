package org.calvin.Graph;

import com.google.common.collect.Lists;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class TopologicalSortTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void shouldTopologicalSort() throws Exception {
        Graph g = Setup.createDAG();
        List<String> actual = TopologicalSort.sort(g);
        List<String> expected = Lists.newArrayList("A","B","C","D","E","F");
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotTopologicalSortCyclicGraph() throws Exception {
        expectedException.expect(Exception.class);
        expectedException.expectMessage("Graph has a cycle!");
        Graph g = Setup.createDAG();
        g.getNode("C").addEdge(g.getNode("C"), 2);
        List<String> actual = TopologicalSort.sort(g);
        List<String> expected = Lists.newArrayList("A","B","C","D","E","F");
        assertEquals(expected, actual);
    }
}