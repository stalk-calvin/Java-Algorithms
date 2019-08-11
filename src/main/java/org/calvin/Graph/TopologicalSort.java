package org.calvin.Graph;

import java.util.*;

public class TopologicalSort {
    public static List<String> sort(Graph g) {
        Queue<String> q = new LinkedList<>();
        Map<String, Integer> indegreeMap = new HashMap<>();
        for (Map.Entry<String, Node> m : g.getNodes().entrySet()) {
            int indegree = g.getIndegree(m.getKey());
            indegreeMap.put(m.getKey(), indegree);
            if (indegree == 0) {
                q.add(m.getKey());
            }
        }

        List<String> result = new ArrayList<>();
        while(!q.isEmpty()) {
            String key = q.poll();
            result.add(key);

            Map<String, List<Node>> adjacentVertices = g.getAdjacentNodes(key);
            for (Map.Entry<String, List<Node>> n : adjacentVertices.entrySet()) {
                String adjacentVertex = n.getKey();
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
