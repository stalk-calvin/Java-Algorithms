package org.calvin.Graph.Adjacency;

import org.calvin.Graph.Adjacency.AdjacencySet.AdjacencySetGraph;
import org.calvin.Graph.Adjacency.AdjacencySet.Node;
import org.calvin.Graph.GraphType;

public class Setup {
    public static Graph createAdjacencySetGraph() {
        Graph g = new AdjacencySetGraph(5, GraphType.UNDIRECTED);
        Node Node0 = new Node(0);
        Node Node1 = new Node(1);
        Node Node2 = new Node(2);
        Node Node3 = new Node(3);
        Node Node4 = new Node(4);
        g.addEdge(Node0.getVertexId(), Node1.getVertexId());
        g.addEdge(Node0.getVertexId(), Node2.getVertexId());
        g.addEdge(Node1.getVertexId(), Node3.getVertexId());
        g.addEdge(Node1.getVertexId(), Node4.getVertexId());
        g.addEdge(Node2.getVertexId(), Node3.getVertexId());
        g.addEdge(Node3.getVertexId(), Node4.getVertexId());

        return g;
    }

    public static Graph createSetDAG() {
        Graph g = new AdjacencySetGraph(5, GraphType.DIRECTED);
        Node Node0 = new Node(0);
        Node Node1 = new Node(1);
        Node Node2 = new Node(2);
        Node Node3 = new Node(3);
        Node Node4 = new Node(4);
        g.addEdge(Node0.getVertexId(), Node1.getVertexId());
        g.addEdge(Node0.getVertexId(), Node2.getVertexId());
        g.addEdge(Node1.getVertexId(), Node4.getVertexId());
        g.addEdge(Node2.getVertexId(), Node3.getVertexId());
        g.addEdge(Node3.getVertexId(), Node1.getVertexId());
        g.addEdge(Node3.getVertexId(), Node4.getVertexId());

        return g;
    }
}
