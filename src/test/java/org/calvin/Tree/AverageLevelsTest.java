package org.calvin.Tree;

import com.google.common.collect.Lists;
import org.calvin.Tree.AssortedMethods;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AverageLevelsTest {

    @Test
    public void averageOfLevels() {
        int[] input = {3,9,20,1,2,15,7};
        TreeNode root = AssortedMethods.createTreeFromArray(input);
        List<Double> actual = AverageLevels.averagePerLevels(root);
        List<Double> expected = Lists.newArrayList(3.0, 14.5, 6.25);
        assertEquals(expected, actual);
    }
}