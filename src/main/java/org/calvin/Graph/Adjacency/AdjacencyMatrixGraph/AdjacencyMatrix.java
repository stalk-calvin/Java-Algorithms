package org.calvin.Graph.Adjacency.AdjacencyMatrixGraph;

import org.calvin.Graph.Adjacency.Graph;
import org.calvin.Graph.GraphType;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AdjacencyMatrix implements Graph {
    private int[][] adjacencyMatrix;
    private GraphType graphType;
    private int numVertices = 0;

    public AdjacencyMatrix(int numVertices, GraphType graphType) {
        this.numVertices = numVertices;
        this.graphType = graphType;

        adjacencyMatrix = new int[numVertices][numVertices];

        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                adjacencyMatrix[i][j] = 0;
            }
        }
    }

    @Override
    public void addEdge(int v1, int v2) {
        if (v1 >= numVertices || v1 < 0 || v2 >= numVertices || v2 < 0) {
            throw new IllegalArgumentException("invalid vertex!");
        }

        adjacencyMatrix[v1][v2] = 1;
        if (graphType == GraphType.UNDIRECTED) {
            adjacencyMatrix[v2][v1] = 1;
        }
    }

    @Override
    public void addEdge(int v1, int v2, int weight) {
        if (v1 >= numVertices || v2 >= numVertices || v1 < 0 || v2 < 0) {
            throw new  IllegalArgumentException("Vertex number is not valid");
        }
        adjacencyMatrix[v1][v2] = weight;
        if(graphType == GraphType.UNDIRECTED) {
            adjacencyMatrix[v2][v1] = weight;
        }
    }

    @Override
    public int getWeightedEdge(int v1, int v2) {
        return adjacencyMatrix[v1][v2];
    }

    @Override
    public List<Integer> getAdjacentVertices(int v) {
        if (v >= numVertices || v < 0) {
            throw new IllegalArgumentException("Invalid vertex!");
        }

        List<Integer> adjacentLists = new ArrayList<>();
        for (int i = 0; i < numVertices; i++) {
            if (adjacencyMatrix[v][i] == 1) {
                adjacentLists.add(i);
            }
        }

        Collections.sort(adjacentLists);

        return adjacentLists;
    }

    @Override
    public int getNumVertices() {
        return numVertices;
    }

    @Override
    public int getIndegree(int v) {
        if (v < 0 || v >= getNumVertices()) {
            throw new IllegalArgumentException("Invalid Vertex!");
        }
        int indegree = 0;
        for (int i = 0; i < getNumVertices(); i++) {
            if (adjacencyMatrix[v][i] == 1) {
                indegree++;
            }
        }
        return indegree;
    }
}
