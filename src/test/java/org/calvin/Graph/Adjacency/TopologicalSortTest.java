package org.calvin.Graph.Adjacency;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class TopologicalSortTest {
    @Test
    public void sort() {
        Graph g = Setup.createSetDAG();
        List<Integer> result = TopologicalSort.sort(g);
        result.forEach(System.out::println);
    }
}