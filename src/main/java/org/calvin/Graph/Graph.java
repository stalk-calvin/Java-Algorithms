package org.calvin.Graph;

import java.util.List;
import java.util.Map;

public interface Graph {
    GraphType TypeofGraph();
    void addEdge(String source, String dest, int weight) throws Exception;
    Node addNode(String key);
    Node getNode(String key);
    Map<String, Node> getNodes();
    Map<String, List<Node>> getAdjacentNodes(String key);
    int getNumVertices();
    int getIndegree(String key);
}
