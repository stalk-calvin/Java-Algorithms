package org.calvin.GraphMatrix.findpaths;

import java.util.ArrayList;
import java.util.List;

public class Cell {
    private String id;
    private boolean isEnd = false;

    private List<Cell> neighbourhoods = new ArrayList<>();

    public Cell(String id) {
        this.id = id;
    }

    public void addNeighbourhood(Cell... neighbours) {
        for (Cell neighbour : neighbours) {
            neighbourhoods.add(neighbour);
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public void setNeighbourhoods(List<Cell> neighbourhoods) {
        this.neighbourhoods = neighbourhoods;
    }

    @Override
    public String toString() {
        return "Cell{" +
                "id='" + id + '\'' +
                ", isEnd=" + isEnd +
                '}';
    }
}
