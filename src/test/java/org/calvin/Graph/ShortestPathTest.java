package org.calvin.Graph;

import com.google.common.collect.Lists;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.calvin.Graph.Setup.createDAGForShortest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ShortestPathTest {
    private Graph newGraph;
    private ShortestPath fixture;

    @BeforeEach
    public void setUp() throws Exception {
        newGraph = createDAGForShortest();
        fixture = new ShortestPath(newGraph);
    }

    @Test
    public void shouldFindShortestPath() throws Exception {
        List<String> actual = fixture.findShortestPath("A", "F");
        List<String> expected = Lists.newArrayList("A", "C", "F");
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotFindShortestPath() {
        Exception exception =
                assertThrows(Exception.class, () ->
                    fixture.findShortestPath("A", "Z"));
        assertEquals("Invalid start or end!", exception.getMessage());
    }
}