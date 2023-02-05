package org.calvin.Tree;

import com.google.common.collect.Lists;
import org.calvin.__Utils.AssortedMethods;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiagonalDistanceTest {
    @Test
    public void shouldFindDiagonalDistance() {
        int[] input = {1,2,3,4,5,6,7};
        TreeNode root = AssortedMethods.createTreeFromArray(input);
        root.print();
        List<List<Integer>> expected = Lists.newArrayList(
                Lists.newArrayList(1,3,7),
                Lists.newArrayList(2,5,6),
                Lists.newArrayList(4)
        );
        assertEquals(expected, DiagonalDistance.diagonalDistance(root));
    }
}