/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Graph.Dijkstra;

import lombok.Data;

@Data
public class Edge {
    private int t, cost;

    public Edge(int t, int cost) {
        this.t = t;
        this.cost = cost;
    }
}
