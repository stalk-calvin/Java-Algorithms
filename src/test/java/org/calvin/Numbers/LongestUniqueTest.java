package org.calvin.Numbers;

import com.google.common.collect.Lists;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestUniqueTest {

    @Test
    public void longestTwoUnique() {
        List<Integer> input = Arrays.asList(1, 3, 5, 3, 1, 3, 1, 5);
        assertEquals(Lists.newArrayList(3,1,3,1), LongestUnique.longestTwoUnique(input));
        input = Arrays.asList(5, 3, 5, 3, 1, 3, 1, 5);
        assertEquals(Lists.newArrayList(5,3,5,3), LongestUnique.longestTwoUnique(input));
        input = Arrays.asList(5,6,7,8,9,8,9,5,5,5,9);
        assertEquals(Lists.newArrayList(9,5,5,5,9), LongestUnique.longestTwoUnique(input));
        input = Arrays.asList(9,5,5,5,9,5,6,7,8,9,8);
        assertEquals(Lists.newArrayList(9,5,5,5,9,5), LongestUnique.longestTwoUnique(input));
    }

    @Test
    public void longestKUniqueCount() {
        List<Integer> input = Arrays.asList(1, 3, 5, 3, 1, 3, 1, 5); // any one of them
        assertEquals(1, LongestUnique.lengthOfLongestKUniqueCount(input,1));
        input = Arrays.asList(1, 3, 5, 3, 1, 3, 1, 5); // 3,1,3,1 = 4
        assertEquals(4, LongestUnique.lengthOfLongestKUniqueCount(input,2));
        input = Arrays.asList(5, 3, 5, 3, 5, 3, 1, 3, 1); // 5,3,5,3,5,3 = 6
        assertEquals(6, LongestUnique.lengthOfLongestKUniqueCount(input,2));
        input = Arrays.asList(1, 3, 5, 3, 1, 3, 1, 5); // everything
        assertEquals(8, LongestUnique.lengthOfLongestKUniqueCount(input,3));
    }
}