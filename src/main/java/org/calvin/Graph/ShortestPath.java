package org.calvin.Graph;

import java.util.*;

public class ShortestPath {
    private Graph G;
    private Map<String, String> previous;
    private Map<String, Integer> pathWeight;
    private List<PathNode> remaining;

    private static class PathNode {
        String key;
        int weight;
        private PathNode(String k, int w) {
            key = k;
            weight = w;
        }
    }

    public ShortestPath(Graph g) {
        G = g;
        previous = new HashMap<>();
        pathWeight = new HashMap<>();
        remaining = new ArrayList<>();
        for (Map.Entry<String, Node> n : g.getNodes().entrySet()) {
            previous.put(n.getKey(), null);
            pathWeight.put(n.getKey(), Integer.MAX_VALUE);
            remaining.add(new PathNode(n.getKey(), pathWeight.get(n.getKey())));
        }
    }

    public List<String> findShortestPath(String start, String end) throws Exception {
        Map<String, Node> nodes = G.getNodes();
        if (!nodes.containsKey(start) || !nodes.containsKey(end)) {
            throw new Exception("Invalid start or end!");
        }
        pathWeight.put(start, 0);
        setKey(remaining, start, 0);
        while (!remaining.isEmpty()) {
            PathNode p = extractMin();
            Node minNode = G.getNode(p.key);
            for (Map.Entry<String, List<Node>> key : minNode.adj_nodes.entrySet()) {
                int new_weight = (minNode.adj_weights.get(key.getKey()) + pathWeight.get(p.key));
                if (pathWeight.get(key.getKey()) > new_weight) {
                    previous.put(key.getKey(), minNode.getKey());
                    pathWeight.put(key.getKey(), new_weight);
                    setKey(remaining, key.getKey(), new_weight);
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

    private PathNode extractMin() {
        int minimum = Integer.MAX_VALUE;
        int minimum_index = -1;
        for (int i = 0; i < remaining.size(); i++) {
            PathNode node = remaining.get(i);
            if (node.weight < minimum) {
                minimum = node.weight;
                minimum_index = i;
            }
        }
        PathNode p = remaining.remove(minimum_index);

        return p;
    }

    private static void setKey(List<PathNode> current, String key, int value) {
        for (PathNode p : current) {
            if (p.key.equals(key)) {
                p.weight = value;
            }
        }
    }
}
