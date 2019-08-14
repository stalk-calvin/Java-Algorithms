/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Graph;

import com.google.common.collect.Lists;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.calvin.Graph.Setup.createUndirectedGraph;
import static org.junit.Assert.assertEquals;

public class BfsDfsTest {
    private Graph newGraph;
    private BfsDfs fixture;
    private List<String> vertices = Lists.newArrayList();
    private static Node source;

    @Before
    public void setUp() throws Exception {
        newGraph = createUndirectedGraph();
        source = newGraph.getNode("A");
        fixture = new BfsDfs(vertices);
    }

    @Test
    public void shouldTraverseDFS() {
        List<String> expected = Lists.newArrayList("A","B","E","F","C","D");
        fixture.dfs(source);
        assertEquals(expected, vertices);
    }

    @Test
    public void shouldTraverseDFSStack() {
        List<String> expected = Lists.newArrayList("A", "D", "C", "B", "F", "E");
        fixture.dfsStack(source);
        assertEquals(expected, vertices);
    }

    @Test
    public void shouldTraverseBFS() {
        List<String> expected = Lists.newArrayList("A","B","C","D","E","F");
        fixture.bfs(source);
        assertEquals(expected, vertices);
    }
}
