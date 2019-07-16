package org.calvin.Graph.Adjacency;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class DFSTest {
    @Test
    public void shouldDFS() {
        Graph g = Setup.createAdjacencySetGraph();
        boolean[] visited = new boolean[g.getNumVertices()];
        List<Integer> result = new ArrayList<>();
        DFS.dfs(g, visited, 0, result);
        result.forEach(System.out::println);
    }
}