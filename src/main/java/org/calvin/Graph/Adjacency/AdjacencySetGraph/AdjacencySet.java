package org.calvin.Graph.Adjacency.AdjacencySetGraph;

import org.calvin.Graph.Adjacency.Graph;
import org.calvin.Graph.GraphType;

import java.util.ArrayList;
import java.util.List;

public class AdjacencySet implements Graph {
    private List<Node> vertexList = new ArrayList<>();
    private GraphType graphType;

    private int numVertices = 0;

    public AdjacencySet(int numVertices, GraphType graphType) {
        this.numVertices = numVertices;
        this.graphType = graphType;
        for (int i = 0; i < numVertices; i++) {
            vertexList.add(new Node(i));
        }
    }

    @Override
    public void addEdge(int v1, int v2) {
        if (v1 >= numVertices || v1 < 0 || v2 >= numVertices || v2 < 0) {
            throw new IllegalArgumentException("invalid vertex!");
        }
        vertexList.get(v1).addEdge(v2);
        if (graphType.equals(GraphType.UNDIRECTED)) {
            vertexList.get(v2).addEdge(v1);
        }
    }

    @Override
    public void addEdge(int v1, int v2, int weight) {
        throw new IllegalArgumentException("Weight not implemented in Adjacency Set");
    }

    @Override
    public int getWeightedEdge(int v1, int v2) {
        throw new IllegalArgumentException("Weight not implemented in Adjacency Set");
    }

    @Override
    public List<Integer> getAdjacentVertices(int v) {
        if (v >= numVertices || v < 0 || vertexList.get(v) == null) {
            throw new IllegalArgumentException("Invalid vertex!");
        }

        return vertexList.get(v).getAdjacentVertices();
    }

    @Override
    public int getNumVertices() {
        return numVertices;
    }

    @Override
    public int getIndegree(int v) {
        if (v<0 || v>= getNumVertices()) {
            throw new IllegalArgumentException("Invalid Vertex!");
        }
        int indegree = 0;
        for (int i = 0; i < getNumVertices(); i++) {
            if (getAdjacentVertices(i).contains(v)) {
                indegree++;
            }
        }
        return indegree;
    }
}