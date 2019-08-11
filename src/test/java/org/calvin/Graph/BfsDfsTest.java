/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Graph;

import com.google.common.collect.Lists;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class BfsDfsTest {
    private Graph newGraph;
    private BfsDfs fixture;
    private List<String> vertices = Lists.newArrayList();
    private static Node source;

    @Before
    public void setUp() throws Exception {
        newGraph = createNewGraph();
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

    private static Graph createNewGraph() throws Exception {
        int numNodes = 6;
        Graph g = new GraphImpl(GraphType.UNDIRECTED);
        Node[] temp = new Node[numNodes];

        temp[0] = new Node("A");
        temp[1] = new Node("B");
        temp[2] = new Node("C");
        temp[3] = new Node("D");
        temp[4] = new Node("E");
        temp[5] = new Node("F");

        g.addEdge("A", "B", 1);
        g.addEdge("A", "C", 2);
        g.addEdge("A", "D", 3);
        g.addEdge("B", "E", 4);
        g.addEdge("B", "F", 5);

        for (int i = 0; i < numNodes; i++) {
            g.addNode(temp[i].getKey());
        }

        source = g.getNode("A");

        return g;
    }
}
