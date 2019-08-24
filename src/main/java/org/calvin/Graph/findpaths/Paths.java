package org.calvin.Graph.findpaths;

import org.calvin.Graph.State;

import java.util.*;

public class Paths {

    // DFS
    public static boolean findPaths(Cell current, List<Cell> currentPath) {
        currentPath.add(current);
        if (current.isEnd()) {
            return true;
        }

        for (Cell neighbour : current.getNeighbourhoods()) {
            if (!currentPath.contains(neighbour)) {
                if (findPaths(neighbour, currentPath)) {
                    return true;
                }
            }
        }

        return false;
    }

    //BFS
    public static List<Cell> findPaths(Cell current) {
        Queue<Cell> tracker = new LinkedList<>();
        List<Cell> result = new ArrayList<>();
        if (current.isEnd()) {
            return result;
        }

        Map<Cell, Cell> prev_node_keys = new HashMap<>();
        prev_node_keys.put(current, null);
        current.setVisited(State.Visited);
        tracker.add(current);
        Cell destination = null;
        while (!tracker.isEmpty()) {
            Cell tmp = tracker.poll();
            if (tmp.isEnd()) {
                destination = tmp;
            }
            for (Cell neighbour : tmp.getNeighbourhoods()) {
                if (!neighbour.getVisited().equals(State.Visited)) {
                    neighbour.setVisited(State.Visited);
                    tracker.add(neighbour);
                    prev_node_keys.put(neighbour, tmp);
                }
            }
        }

        if (destination == null) {
            return result;
        } else {
            result.add(destination);
            Cell prev_node_key = prev_node_keys.get(destination);
            while (prev_node_key != null) {
                result.add(0, prev_node_key);
                prev_node_key = prev_node_keys.get(prev_node_key);
            }
        }

        return result;
    }
}
