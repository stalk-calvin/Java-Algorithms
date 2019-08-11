/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Node {
    public Map<String, List<Node>> adj_nodes;
    public Map<String, Integer> adj_weights;
    private String key;
    public State state;

    private int incoming_edges;

    public Node(String vertex) {
        this.key = vertex;
        this.state = State.Unvisited;
        incoming_edges = 0;
        adj_nodes = new HashMap<>();
        adj_weights = new HashMap<>();
    }

    public void addEdge(Node adj, int weight) throws Exception {
        if (adj == null) {
            throw new Exception("Node cannot be null to add");
        }
        if (!adj_nodes.containsKey(adj.key)) {
            adj_nodes.put(adj.key, new ArrayList<>());
        }
        adj.incoming_edges++;
        adj_nodes.get(adj.key).add(adj);
        adj_weights.put(adj.key, weight);
    }

    public void removeChildNode(Node adj) throws Exception {
        if (adj == null) {
            throw new Exception("Node cannot be null to add");
        }
        adj.incoming_edges--;
        adj_nodes.remove(adj.key);
        adj_weights.remove(adj.key);
    }

    public Map<String, List<Node>> getChild() {
        return adj_nodes;
    }

    public String getKey() {
        return key;
    }

    public Integer getWeight(String key) {
        return adj_weights.get(key);
    }

    public int getIncomingEdges() {
        return incoming_edges;
    }
}
