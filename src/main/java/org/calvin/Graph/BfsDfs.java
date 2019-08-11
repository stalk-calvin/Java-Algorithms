/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Graph;

import lombok.AllArgsConstructor;

import java.util.*;

@AllArgsConstructor
public class BfsDfs {
    List<String> vertices;

    public void dfs(Node root) {
        if(root == null) return;

        vertices.add(root.getKey());
        root.state = State.Visited;

        // go through each children
        for(Map.Entry<String, List<Node>> m : root.getChild().entrySet()) {
            for (Node n : m.getValue()) {
                // recurse if unvisited
                if (n.state == State.Unvisited) {
                    dfs(n);
                }
            }
        }
    }

    public void dfsStack(Node root) {
        if(root == null) return;

        Stack<Node> st = new Stack<>();
        st.add(root);
        root.state = State.Visited;

        while(!st.isEmpty()) {
            Node r = st.pop();

            vertices.add(r.getKey());

            // go through each children
            for(Map.Entry<String, List<Node>> m : r.getChild().entrySet()) {
                for (Node n : m.getValue()) {
                    // recurse if unvisited
                    if (n.state == State.Unvisited) {
                        st.push(n);
                        n.state = State.Visited;
                    }
                }
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
            vertices.add(r.getKey());

            // Go visit adjacent
            for(Map.Entry<String, List<Node>> m : r.getChild().entrySet()) {
                for (Node n : m.getValue()) {
                    // if vertex is not visited, add to queue and set visited
                    if (n.state == State.Unvisited) {
                        queue.add(n);
                        n.state = State.Visited;
                    }
                }
            }
        }
    }
}
