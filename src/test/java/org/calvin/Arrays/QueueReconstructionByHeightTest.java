package org.calvin.Arrays;

import org.junit.Before;
import org.junit.Test;

public class QueueReconstructionByHeightTest {
    private QueueReconstructionByHeight fixture;

    @Before
    public void setUp() throws Exception {
        fixture = new QueueReconstructionByHeight();
    }

    @Test
    public void reconstructQueue() throws Exception {
        //[[7,0], [4,4], [7,1], [5,0], [6,1], [5,2]]
        int[][] input = new int[6][];
        input[0] = new int[]{7,0};
        input[1] = new int[]{4,4};
        input[2] = new int[]{7,1};
        input[3] = new int[]{5,0};
        input[4] = new int[]{6,1};
        input[5] = new int[]{5,2};
        int[][] actual = fixture.reconstructQueue(input);
        for (int[] x : actual) {
            for (int y : x) {
                System.out.print(y+ " : ");
            }
            System.out.println();
        }
    }
}