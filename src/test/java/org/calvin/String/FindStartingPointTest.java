package org.calvin.String;

import com.google.common.collect.Lists;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindStartingPointTest {

    @Test
    public void shouldFindStartingPosition() {
       List<Integer> expected = Lists.newArrayList(0, 7);
       assertEquals(expected, FindStartingPoint.findStartingPosition("abracadabra", "abr"));
    }

    @Test
    public void shouldFindASingleMatch() {
        List<Integer> expected = Lists.newArrayList(0);
        assertEquals(expected, FindStartingPoint.findStartingPosition("abracadabra", "abracadabra"));
    }

    @Test
    public void shouldNotFindEveryStartingPosition() {
        List<Integer> expected = Lists.newArrayList();
        assertEquals(expected, FindStartingPoint.findStartingPosition("abracadabra", ""));
    }

    @Test
    public void shouldNotFindAnyStartingPosition() {
        List<Integer> expected = Lists.newArrayList();
        assertEquals(expected, FindStartingPoint.findStartingPosition("abracadabra", "xxx"));
    }
}