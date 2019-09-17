package org.calvin.String.order;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ByNumericTest {
    @Test
    public void testComparatorByNumeric() {
        List<String> list = Lists.newArrayList("10", "1", "20", "11", "21", "12");
        Collections.sort(list, new ByNumeric());
        List<String> expected = Lists.newArrayList("1", "10", "11", "12", "20", "21");
        assertEquals(expected, list);
    }
}