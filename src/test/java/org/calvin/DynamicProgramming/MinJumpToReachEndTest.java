package org.calvin.DynamicProgramming;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MinJumpToReachEndTest {
    private MinJumpToReachEnd fixture;
    private static int arr[] = {1,3,5,3,2,2,6,1,6,8,9};

    @BeforeEach
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