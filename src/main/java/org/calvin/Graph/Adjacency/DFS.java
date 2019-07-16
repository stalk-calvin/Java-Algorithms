package org.calvin.Graph.Adjacency;

import java.util.List;

public class DFS {
    public static void dfs(Graph graph, boolean[] visited, int currentVertex, List<Integer> result) {
        if (visited[currentVertex]) {
            return;
        }

        visited[currentVertex] = true;

        List<Integer> adacencylist = graph.getAdjacentVertices(currentVertex);

        for (Integer i : adacencylist) {
            dfs(graph, visited, i, result);
        }

        result.add(currentVertex);
    }
}
