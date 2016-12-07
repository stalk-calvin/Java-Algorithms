/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.Search.Graph;

import lombok.AllArgsConstructor;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

@AllArgsConstructor
public class BfsDfs {
    List<String> vertices;

    public void dfs(Node root) {
        if(root == null) return;

        vertices.add(root.getVertex());
        root.state = State.Visited;

        // go through each children
        for(Node n: root.getChild()) {
            // recurse if unvisited
            if(n.state == State.Unvisited) {
                dfs(n);
            }
        }
    }

    public void bfs(Node root) {
        if(root == null) return;
        Queue<Node> queue = new LinkedList<>();

        root.state = State.Visited;
        queue.add(root);

        while(!queue.isEmpty()) {
            // Get the first node
            Node r = queue.remove();

            // Gather vertex
            vertices.add(r.getVertex());

            // Go visit adjacent
            for(Node n: r.getChild()) {
                // if vertex is not visited, add to queue and set visited
                if(n.state == State.Unvisited) {
                    queue.add(n);
                    n.state = State.Visited;
                }
            }
        }
    }
}
