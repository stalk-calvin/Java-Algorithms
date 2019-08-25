package org.calvin.Arrays;

import com.google.common.collect.Lists;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class MergeKSortedArrayTest {
    private MergeKSortedArray fixture;

    @Before
    public void setUp() throws Exception {
        fixture = new MergeKSortedArray();
    }

    @Test
    public void mergeKSortedArray() {
        List<Integer> actual = fixture.mergeKSortedArray(
                new ArrayList<>(Arrays.asList(1, 3, 12, 13, 19, 28, 29)),
                new ArrayList<>(Arrays.asList(4, 6, 9, 11, 19, 21, 33)),
                new ArrayList<>(Arrays.asList(2, 6, 9, 19, 29, 33, 43)),
                new ArrayList<>(Arrays.asList(2, 5, 12, 18, 19, 31, 33)),
                new ArrayList<>(Arrays.asList(5, 15, 25, 35, 45, 55, 65, 75)),
                new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50, 60, 70))
        );
        List<Integer> expected = Lists.newArrayList(
                1, 2, 2, 3, 4, 5, 5, 6, 6, 9, 9, 10, 11, 12, 12,
                13, 15, 18, 19, 19, 19, 19, 20, 21, 25, 28, 29, 29, 30, 31,
                33, 33, 33, 35, 40, 43, 45, 50, 55, 60, 65, 70, 75);
        assertEquals(expected, actual);
    }
}