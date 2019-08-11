package org.calvin.Graph.Adjacency.AdjacencySetGraph;

import java.util.*;

public class Node {
    public int getVertexId() {
        return vertexId;
    }

    private int vertexId;
    private Set<Integer> adjacencySet = new HashSet<>();

    public Node(int vertexId) {
        this.vertexId = vertexId;
    }

    public void addEdge(int vertexId) {
        adjacencySet.add(vertexId);
    }

    public List<Integer> getAdjacentVertices() {
        List<Integer> result = new ArrayList<>(adjacencySet);
        Collections.sort(result);
        return result;
    }
}
