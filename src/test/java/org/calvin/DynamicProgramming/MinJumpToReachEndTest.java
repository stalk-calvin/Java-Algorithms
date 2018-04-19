package org.calvin.DynamicProgramming;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinJumpToReachEndTest {
    private MinJumpToReachEnd fixture;
    private static int arr[] = {1,3,5,3,2,2,6,1,6,8,9};

    @Before
    public void setUp() throws Exception {
        fixture = new MinJumpToReachEnd();
    }

    @Test
    public void shouldCountJumpDP() throws Exception {
        int r[] = new int[arr.length];
        int result = fixture.minJump(arr, r);
        assertEquals(4, result);
    }

    @Test
    public void shouldCountJump() throws Exception {
        int count = fixture.jump(arr);
        assertEquals(4, count);
    }

}