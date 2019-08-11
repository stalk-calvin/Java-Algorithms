/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Graph;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GraphImpl implements Graph {
    private int numVertices; // num of vertices
    private GraphType graphType;
    private Map<String, Node> nodes;

    public GraphImpl(GraphType graphType) {
        this.graphType = graphType;
        nodes = new HashMap<>();
        numVertices = 0;
    }

    @Override
    public Node addNode(String key) {
        if(!nodes.containsKey(key)) {
            numVertices++;
            nodes.put(key, new Node(key));
        }

        return nodes.get(key);
    }

    @Override
    public GraphType TypeofGraph() {
        return graphType;
    }

    @Override
    public void addEdge(String source, String dest, int weight) throws Exception {
        if (!nodes.containsKey(source)) {
            addNode(source);
        }
        if (!nodes.containsKey(dest)) {
            addNode(dest);
        }
        nodes.get(source).addEdge(nodes.get(dest), weight);
        if(graphType == GraphType.UNDIRECTED) {
            nodes.get(dest).addEdge(nodes.get(source), weight);
        }
    }

    @Override
    public Node getNode(String key) {
        if (nodes.containsKey(key)) {
            return nodes.get(key);
        }
        return null;
    }

    @Override
    public Map<String, Node> getNodes() {
        return nodes;
    }

    @Override
    public Map<String, List<Node>> getAdjacentNodes(String key) {
        if (nodes.containsKey(key)) {
            return nodes.get(key).adj_nodes;
        } else {
            return null;
        }
    }

    @Override
    public int getNumVertices() {
        return numVertices;
    }

    @Override
    public int getIndegree(String key) {
        if (nodes.containsKey(key)) {
            return nodes.get(key).getIncomingEdges();
        } else {
            return -1;
        }
    }
}
