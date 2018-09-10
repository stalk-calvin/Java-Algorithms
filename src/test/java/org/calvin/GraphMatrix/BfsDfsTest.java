/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.GraphMatrix;

import com.google.common.collect.Lists;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class BfsDfsTest {
    private Graph newGraph;
    private BfsDfs fixture;
    private List<String> vertices = Lists.newArrayList();

    @Before
    public void setUp() {
        newGraph = createNewGraph();
        fixture = new BfsDfs(vertices);
    }

    @Test
    public void shouldTraverseDFS() {
        List<String> expected = Lists.newArrayList("A","B","E","F","C","D");
        fixture.dfs(newGraph.getNode()[0]);
        assertEquals(expected, vertices);
    }

    @Test
    public void shouldTraverseBFS() {
        List<String> expected = Lists.newArrayList("A","B","C","D","E","F");
        fixture.bfs(newGraph.getNode()[0]);
        assertEquals(expected, vertices);
    }

    private static Graph createNewGraph() {
        Graph g = new Graph();
        Node[] temp = new Node[8];

        temp[0] = new Node("A", 3);
        temp[1] = new Node("B", 3);
        temp[2] = new Node("C", 1);
        temp[3] = new Node("D", 1);
        temp[4] = new Node("E", 1);
        temp[5] = new Node("F", 1);

        temp[0].addChildNode(temp[1]);
        temp[0].addChildNode(temp[2]);
        temp[0].addChildNode(temp[3]);

        temp[1].addChildNode(temp[0]);
        temp[1].addChildNode(temp[4]);
        temp[1].addChildNode(temp[5]);

        temp[2].addChildNode(temp[0]);
        temp[3].addChildNode(temp[0]);
        temp[4].addChildNode(temp[1]);
        temp[5].addChildNode(temp[1]);

        for (int i = 0; i < 7; i++) {
            g.addNode(temp[i]);
        }
        return g;
    }
}
