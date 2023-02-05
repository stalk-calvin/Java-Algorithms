package org.calvin.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NextGreaterElementTest {
    private NextGreaterElement fixture;

    @BeforeEach
    public void setUp() throws Exception {
        fixture = new NextGreaterElement();
    }

    @Test
    public void shouldCalculateNextGreaterElement() throws Exception {
        int[] nums1 = new int[]{4,1,2};
        int[] nums2 = new int[]{1,3,4,2};
        int[] result = fixture.nextGreaterElement(nums1, nums2);
        int[] expected = new int[]{-1,3,-1};
        assertArrayEquals(expected, result);
    }

    @Test
    public void shouldCalculateNextGreaterElementLong() throws Exception {
        int[] nums1 = new int[]{4,1,2,9,2,8,7};
        int[] nums2 = new int[]{1,3,4,2,7,8,0,6,9};
        int[] result = fixture.nextGreaterElement(nums1, nums2);
        int[] expected = new int[]{7,3,7,-1,7,9,8};
        assertArrayEquals(expected, result);
    }
}