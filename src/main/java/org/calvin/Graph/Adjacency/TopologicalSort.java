package org.calvin.Graph.Adjacency;

import java.util.*;

public class TopologicalSort {
    public static List<Integer> sort(Graph g) {
        Queue<Integer> q = new LinkedList<>();
        Map<Integer, Integer> indegreeMap = new HashMap<>();
        for (int i = 0; i < g.getNumVertices(); i++) {
            int indegree = g.getIndegree(i);
            indegreeMap.put(i, indegree);
            if (indegree == 0) {
                q.add(i);
            }
        }

        List<Integer> result = new ArrayList<>();
        while(!q.isEmpty()) {
            int vertex = q.poll();
            result.add(vertex);

            List<Integer> adjacentVertices = g.getAdjacentVertices(vertex);
            for (int adjacentVertex : adjacentVertices) {
                int updatedIndegree = indegreeMap.get(adjacentVertex) - 1;
                indegreeMap.remove(adjacentVertex);
                indegreeMap.put(adjacentVertex, updatedIndegree);

                if (updatedIndegree == 0) {
                    q.add(adjacentVertex);
                }
            }
        }

        if (result.size() != g.getNumVertices()) {
            throw new RuntimeException("Graph has a cycle!");
        }

        return result;
    }
}
