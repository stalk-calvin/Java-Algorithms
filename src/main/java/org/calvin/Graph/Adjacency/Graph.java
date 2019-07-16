package org.calvin.Graph.Adjacency;

import java.util.List;

public interface Graph {
    int getNumVertices();
    void addEdge(int v1, int v2);
    List<Integer> getAdjacentVertices(int v);
    int getIndegree(int v);
}
