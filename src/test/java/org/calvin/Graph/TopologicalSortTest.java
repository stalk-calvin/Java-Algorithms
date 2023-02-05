package org.calvin.Graph;

import com.google.common.collect.Lists;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TopologicalSortTest {
    private Graph g;

    @BeforeEach
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
        g.getNode("C").addEdge(g.getNode("C"), 2);
        Exception exception =
                assertThrows(Exception.class, () ->
                    TopologicalSort.sort(g));
        assertEquals("Graph has a cycle!", exception.getMessage());
    }
}