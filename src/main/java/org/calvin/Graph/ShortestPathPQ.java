package org.calvin.Graph;

import java.util.*;

/*
 * It uses priority queue (heap) to solve the problem easier
 * Rather than using the plain list to find minimum and set keys.
 */
public class ShortestPathPQ {
    private Graph G;
    private Map<String, String> previous;
    private Map<String, Integer> pathWeight;
    private PriorityQueue<PathNode> remaining;

    private class PathNode {
        String key;
        int weight;
        private PathNode(String k, int w) {
            key = k;
            weight = w;
        }
    }

    public ShortestPathPQ(Graph g) {
        G = g;
        previous = new HashMap<>();
        pathWeight = new HashMap<>();
        remaining = new PriorityQueue<>(G.getNumVertices(), new Comparator<PathNode>() {
            @Override
            public int compare(PathNode node1, PathNode node2) {
                return Integer.compare(node1.weight, node2.weight);
            }
        });
        for (Map.Entry<String, Node> n : g.getNodes().entrySet()) {
            previous.put(n.getKey(), null);
            pathWeight.put(n.getKey(), Integer.MAX_VALUE);
        }
    }

    public List<String> findShortestPath(String start, String end) throws Exception {
        Map<String, Node> nodes = G.getNodes();
        if (!nodes.containsKey(start) || !nodes.containsKey(end)) {
            throw new Exception("Invalid start or end!");
        }
        pathWeight.put(start, 0);
        remaining.add(new PathNode(start, 0));
        while (!remaining.isEmpty()) {
            PathNode p = remaining.poll();
            Node minNode = G.getNode(p.key);
            for (Map.Entry<String, List<Node>> key : minNode.adj_nodes.entrySet()) {
                // Calculation will be off when weight is a negative value
                // minnode is would be a negative here which would cause a cycle in calculating previous node
                int new_weight = (minNode.adj_weights.get(key.getKey()) + p.weight);
                if (pathWeight.get(key.getKey()) > new_weight) {
                    previous.put(key.getKey(),p.key);
                    pathWeight.put(key.getKey(), new_weight);
                    remaining.add(new PathNode(key.getKey(), new_weight));
                }
            }
        }

        List<String> result = new ArrayList<>();
        String currentNodeKey = end;
        while (currentNodeKey != null) {
            result.add(0, currentNodeKey);
            currentNodeKey = previous.get(currentNodeKey);
        }
        return result;
    }
}
