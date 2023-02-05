package org.calvin.String.order;

import com.google.common.collect.Lists;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ByLengthTest {
    @Test
    public void testComparatorByLength() {
        List<String> list = Lists.newArrayList("xxxx", "bc", "jre", "z");
        Collections.sort(list, new ByLength());
        List<String> expected = Lists.newArrayList("z", "bc", "jre", "xxxx");
        assertEquals(expected, list);
    }
}