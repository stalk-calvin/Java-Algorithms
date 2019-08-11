package org.calvin.Graph;

public class Setup {
    static Node[] temp = new Node[5];
    public static Graph createUndirectedGraph() throws Exception  {
        Graph g = new GraphImpl(GraphType.UNDIRECTED);

        temp[0] = new Node("A");
        temp[1] = new Node("B");
        temp[2] = new Node("C");
        temp[3] = new Node("D");
        temp[4] = new Node("E");

        g.addEdge("A", "B", 1);
        g.addEdge("A", "C", 2);
        g.addEdge("A", "D", 3);
        g.addEdge("B", "E", 4);
        g.addEdge("B", "F", 5);
        g.addEdge("C", "F", 2);

        for (int i = 0; i < 5; i++) {
            g.addNode(temp[i].getKey());
        }

        return g;
    }

    public static Graph createDAG() throws Exception {
        Graph g = new GraphImpl(GraphType.DIRECTED);

        temp[0] = new Node("A");
        temp[1] = new Node("B");
        temp[2] = new Node("C");
        temp[3] = new Node("D");
        temp[4] = new Node("E");

        g.addEdge("A", "B", 1);
        g.addEdge("A", "C", 2);
        g.addEdge("A", "D", 3);
        g.addEdge("B", "E", 4);
        g.addEdge("B", "F", 5);

        for (int i = 0; i < 5; i++) {
            g.addNode(temp[i].getKey());
        }

        return g;
    }
}
