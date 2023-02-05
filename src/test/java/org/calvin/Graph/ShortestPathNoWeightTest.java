package org.calvin.Graph;

import com.google.common.collect.Lists;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.calvin.Graph.Setup.createDAGForShortest;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShortestPathNoWeightTest {
    private Graph newGraph;
    private ShortestPathNoWeight fixture;

    @BeforeEach
    public void setUp() throws Exception {
        newGraph = createDAGForShortest();
    }

    @Test
    public void shouldFindShortestPath() {
        List<String> actual = ShortestPathNoWeight.shortestPath(newGraph, "A", "F");

        //Compare the result with ShortestPath with weight
        List<String> expected = Lists.newArrayList("A", "B", "F");

        assertEquals(expected, actual);
    }

    @Test
    public void shouldFindItself() {
        List<String> actual = ShortestPathNoWeight.shortestPath(newGraph, "A", "A");

        List<String> expected = Lists.newArrayList("A");

        assertEquals(expected, actual);
    }
}