package org.calvin.Arrays;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class MergeOverlappingTest {
//    inputs = [(1,3),(5,8),(2,10),(20,25)]
//    merged = self.fixture.merge_overlapping(inputs)
//            self.assertEqual([(1,3),(2,10),(20,25)],merged)
//
//    inputs = [(1, 3), (5, 8), (2, 10), (3, 10)]
    @Test
    public void shouldMergeOverlappingInterval() {
        List<Interval> input = Lists.newArrayList(
            new Interval(1,3),
            new Interval(5,8),
            new Interval(2,10),
            new Interval(20,25)
        );
        List<Interval> actual = MergeOverlapping.mergeOverlappingInterval(input);
        List<Interval> expected = Lists.newArrayList(
                new Interval(1,3),
                new Interval(2,10),
                new Interval(20,25)
        );
        assertEquals(expected, actual);

        input = Lists.newArrayList(
                new Interval(1,3),
                new Interval(5,8),
                new Interval(2,10),
                new Interval(3,10)
        );
        actual = MergeOverlapping.mergeOverlappingInterval(input);
        expected = Lists.newArrayList(
                new Interval(1,3),
                new Interval(2,10)
        );
        assertEquals(expected, actual);

        input = Lists.newArrayList(
                new Interval(0,50),
                new Interval(5,8),
                new Interval(2,10),
                new Interval(3,10)
        );
        actual = MergeOverlapping.mergeOverlappingInterval(input);
        expected = Lists.newArrayList(
                new Interval(0,50)
        );
        assertEquals(expected, actual);

        input = Lists.newArrayList(
                new Interval(0,50),
                new Interval(0,10),
                new Interval(0,20),
                new Interval(0,30)
        );
        actual = MergeOverlapping.mergeOverlappingInterval(input);
        expected = Lists.newArrayList(
                new Interval(0,50)
        );
        assertEquals(expected, actual);
    }
}