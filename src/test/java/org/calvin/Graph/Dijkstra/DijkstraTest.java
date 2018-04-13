/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Graph.Dijkstra;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.junit.Before;
import org.junit.Test;

public class DijkstraTest {
    private static final int[][] cost = { { 0, 3, 2 }, { 0, 0, -2 }, { 0, 0, 0 } };
    private static final int n = cost.length;

    @SuppressWarnings("unchecked")
    private static final List<Edge>[] graph = (List<Edge>[]) Stream.generate(ArrayList::new).limit(n)
            .toArray(List[]::new);

    @Before
    public void setUp() {
        createGraph();
    }

    @Test
    public void shouldGetShortestPaths() {
        int[] distance = new int[n]; // shortest known distance from "s"
        int[] pred = new int[n]; // preceeding node in path
        Dijkstra.shortestPaths(graph, 0, distance, pred);

        assertTrue(0 == distance[0]);
        assertTrue(3 == distance[1]);
        assertTrue(1 == distance[2]);

        assertTrue(-1 == pred[0]);
        assertTrue(0 == pred[1]);
        assertTrue(1 == pred[2]);
    }

    private void createGraph() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (cost[i][j] != 0) {
                    graph[i].add(new Edge(j, cost[i][j]));
                }
            }
        }

    }

}
