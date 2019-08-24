package org.calvin.Graph.findpaths;

import com.google.common.collect.Lists;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PathsTest {
    private Cell source;

    @Before
    public void setUp() {
        setCells();
    }

    @Test
    public void shouldFindPathsDFS() {
        List<Cell> currentPath = new ArrayList<>();
        Paths.findPaths(source, currentPath);
        List<String> expected = Lists.newArrayList("A", "B", "X", "Y", "H");
        assertEquals(currentPath.size(), expected.size());
        for (int i = 0; i < currentPath.size(); i++) {
            assertEquals(expected.get(i), currentPath.get(i).getId());
        }
    }

    @Test
    public void shouldFindPathsBFS() {
        List<Cell> currentPath = Paths.findPaths(source);
        List<String> expected = Lists.newArrayList("A", "B", "X", "Y", "H");
        assertEquals(currentPath.size(), expected.size());
        for (int i = 0; i < currentPath.size(); i++) {
            assertEquals(expected.get(i), currentPath.get(i).getId());
        }
    }

    private void setCells() {
        Cell cA = new Cell("A");
        Cell cB = new Cell("B");
        Cell cC = new Cell("C");
        Cell cD = new Cell("D");
        Cell cE = new Cell("E");
        Cell cF = new Cell("F");
        Cell cG = new Cell("G");
        Cell cH = new Cell("H");
        Cell cX = new Cell("X");
        Cell cY = new Cell("Y");
        cA.addNeighbourhood(cB);
        cB.addNeighbourhood(cA, cX, cC);
        cC.addNeighbourhood(cB, cD, cE);
        cE.addNeighbourhood(cC, cF, cX);
        cX.addNeighbourhood(cB, cY, cE);
        cY.addNeighbourhood(cH, cF, cX);
        cF.addNeighbourhood(cE, cG, cY);
        cG.addNeighbourhood(cF, cH);
        cH.addNeighbourhood(cG);
        cH.setEnd(true);

        source = cA;
    }
}