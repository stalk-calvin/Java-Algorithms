/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Graph.Dijkstra;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DijkstraTest {
    private static final int[][] cost = { { 0, 3, 2 }, { 0, 0, -2 }, { 0, 0, 0 } };
    private static final int n = cost.length;

    @SuppressWarnings("unchecked")
    private static final List<Edge>[] graph = (List<Edge>[]) Stream.generate(ArrayList::new).limit(n)
            .toArray(List[]::new);

    @BeforeEach
    public void setUp() {
        createGraph();
    }

    @Test
    public void shouldGetShortestPaths() {
        int[] dist = new int[n];
        int[] pred = new int[n];
        Dijkstra.shortestPaths(graph, 0, dist, pred);
        assertEquals(0, dist[0]);
        assertEquals(3, dist[1]);
        assertEquals(1, dist[2]);
        assertEquals(-1, pred[0]);
        assertEquals(0, pred[1]);
        assertEquals(1, pred[2]);
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
