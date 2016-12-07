/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.Search.Graph;

public class Node {
    public Node[] child;
    public int childCount;
    private String vertex;
    public State state;

    public Node(String vertex, int children) {
        this.vertex = vertex;
        childCount = 0;
        child = new Node[children];
    }

    public void addChildNode(Node adj) {
        adj.state = State.Unvisited;
        if(childCount < 30) {
            this.child[childCount] = adj;
            childCount++;
        }
    }

    public Node[] getChild() {
        return child;
    }

    public String getVertex() {
        return vertex;
    }
}
