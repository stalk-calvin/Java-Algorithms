package org.calvin.Numbers;

import com.google.common.collect.Lists;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SubsetsTest {
    private Subsets fixture;

    @BeforeEach
    public void setUp() {
        fixture = new Subsets();
    }

    @Test
    public void populateSubsets() {
        List<Integer> input = Lists.newArrayList(1, 2, 3);
        List<List<Integer>> actual = new ArrayList<>();
        Subsets.populateSubsets(actual, input);
        List<List<Integer>> expected = Arrays.asList(
                Lists.newArrayList(),
                Lists.newArrayList(3),
                Lists.newArrayList(2),
                Lists.newArrayList(3,2),
                Lists.newArrayList(1),
                Lists.newArrayList(3,1),
                Lists.newArrayList(2,1),
                Lists.newArrayList(3,2,1)
        );
        assertEquals(expected, actual);
    }
}