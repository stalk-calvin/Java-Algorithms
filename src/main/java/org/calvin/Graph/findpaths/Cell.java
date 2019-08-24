package org.calvin.Graph.findpaths;

import org.calvin.Graph.State;

import java.util.ArrayList;
import java.util.List;

public class Cell {
    private String id;
    private boolean isEnd = false;
    private State visited = State.Unvisited;
    private List<Cell> neighbourhoods = new ArrayList<>();

    public Cell(String id) {
        this.id = id;
    }

    public void addNeighbourhood(Cell... neighbours) {
        for (Cell neighbour : neighbours) {
            neighbourhoods.add(neighbour);
        }
    }

    public State getVisited() {
        return visited;
    }

    public void setVisited(State visited) {
        this.visited = visited;
    }

    public String getId() {
        return id;
    }

    public boolean isEnd() {
        return isEnd;
    }

    public void setEnd(boolean end) {
        isEnd = end;
    }

    public List<Cell> getNeighbourhoods() {
        return neighbourhoods;
    }

    @Override
    public String toString() {
        return "Cell{" +
                "id='" + id + '\'' +
                ", visited=" + visited +
                ", isEnd=" + isEnd +
                '}';
    }
}
