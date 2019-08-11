package org.calvin.Graph;

import java.util.*;

public class ShortestPathNoWeight {

    public static List<String> shortestPath(Graph G, String source, String dest) {
        List<String> result = new ArrayList<>();
        if (source.equals(dest)) {
            result.add(source);
            return result;
        }
        Map<String, String> prev_node_keys = getPreviousShortest(G, source, dest);
        if (prev_node_keys == null) {
            return null;
        } else {
            List<String> path_ids = new ArrayList<>();
            path_ids.add(dest);
            String prev_node_key = prev_node_keys.get(dest);
            while (prev_node_key != null) {
                path_ids.add(0, prev_node_key);
                prev_node_key = prev_node_keys.get(prev_node_key);
            }
            return path_ids;
        }
    }

    private static Map<String, String> getPreviousShortest(Graph G, String source, String dest) {
        Queue<Node> queue = new LinkedList<>();
        Node sourceNode = G.getNode(source);
        queue.add(sourceNode);
        Map<String, String> prev_node_keys = new HashMap<>();
        prev_node_keys.put("source_key", null);
        sourceNode.state = State.Visited;
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            if (node.getKey().equals(dest)) {
                return prev_node_keys;
            }
            for (Map.Entry<String, List<Node>> adj_node : node.adj_nodes.entrySet()) {
                for (Node adj : adj_node.getValue()) {
                    if (adj.state == State.Unvisited) {
                        queue.add(adj);
                        prev_node_keys.put(adj_node.getKey(), node.getKey());
                        adj.state = State.Visited;
                    }
                }
            }
        }
        return null;
    }
}
