package org.calvin.Arrays;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class MissingRangesTest {

    @Test
    public void findMissingRanges() {
        List<String> actual = MissingRanges.findMissingRanges(new int[]{1, 3, 5, 10}, 1, 10);
        assertEquals(Lists.newArrayList("2","4","6->9"), actual);
    }

    @Test
    public void findMissingRangesShorterRange() {
        List<String> actual = MissingRanges.findMissingRanges(new int[]{1, 3, 5, 10}, 5, 10);
        assertEquals(Lists.newArrayList("6->9"), actual);
    }

    @Test
    public void findMissingWithLargerRangesBeyondHigh() {
        List<String> actual = MissingRanges.findMissingRanges(new int[]{0, 1, 3, 50, 75}, 0, 99);
        assertEquals(Lists.newArrayList("2", "4->49", "51->74", "76->99"), actual);
    }

    @Test
    public void findMissingWithLargerRangesLowerLows() {
        List<String> actual = MissingRanges.findMissingRanges(new int[]{0, 1, 3, 50, 75}, -20, 99);
        assertEquals(Lists.newArrayList("-20->0", "2", "4->49", "51->74", "76->99"), actual);
    }
}