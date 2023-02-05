package org.calvin.String.order;

import com.google.common.collect.Lists;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ByIgnoreCaseTest {
    private List<String> list = Lists.newArrayList("A", "a", "B", "b");

    @Test
    public void testComparatorByNormal() {
        List<String> expected = Lists.newArrayList("A", "a", "B", "b");
        assertEquals(expected, list);
        Collections.sort(list);
        expected = Lists.newArrayList("A", "B", "a", "b");
        assertEquals(expected, list);
    }

    @Test
    public void testComparatorByIgnoreCase() {
        List<String> expected = Lists.newArrayList("A", "a", "B", "b");
        assertEquals(expected, list);
        Collections.sort(list, new ByIgnoreCase());
        expected = Lists.newArrayList("A", "a", "B", "b");
        assertEquals(expected, list);
    }
}