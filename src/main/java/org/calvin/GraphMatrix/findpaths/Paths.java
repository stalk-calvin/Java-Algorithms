package org.calvin.GraphMatrix.findpaths;

import java.util.ArrayList;
import java.util.List;

public class Paths {
    public static boolean findPaths(Cell current, List<Cell> currentPath) {
        currentPath.add(current);
        if (current.isEnd()) {
            return true;
        }

        for (Cell neighbour : current.getNeighbourhoods()) {
            if (!currentPath.contains(neighbour)) {
//                List<Cell> neighbourPath = new ArrayList<>(currentPath);
                if (findPaths(neighbour, currentPath)) {
//                    currentPath.clear();
//                    currentPath.addAll(neighbourPath);
                    return true;
                }
            }
        }

        return false;
    }
    public static void main(String[] args) {
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


        List<Cell> currentPath = new ArrayList<>();
        findPaths(cA, currentPath);
        currentPath.forEach(System.out::println);

    }
}
