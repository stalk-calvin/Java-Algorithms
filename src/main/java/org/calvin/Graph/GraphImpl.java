/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Graph;

public class GraphImpl {
    public int count; // num of vertices
    private Node[] vertices;

    public GraphImpl() {
        vertices = new Node[8];
        count = 0;
    }

    public void addEdge(Node n) {
        if(count < 10) {
            vertices[count] = n;
            count++;
        }
    }

    public Node[] getVertices() {
        return vertices;
    }

}
