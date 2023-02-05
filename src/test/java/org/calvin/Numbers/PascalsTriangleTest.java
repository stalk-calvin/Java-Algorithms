/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Numbers;

import com.google.common.collect.Lists;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PascalsTriangleTest {
    PascalsTriangle fixture;

    @BeforeEach
    public void setUp() {
        fixture = new PascalsTriangle();
    }

    @Test
    public void shouldGenerateCorrectTriangle() {
        List<List<Integer>> expected = new ArrayList<List<Integer>>() {{
            add(Lists.newArrayList(1));
            add(Lists.newArrayList(1,1));
            add(Lists.newArrayList(1,2,1));
            add(Lists.newArrayList(1,3,3,1));
            add(Lists.newArrayList(1,4,6,4,1));
        }};

        assertEquals(expected, fixture.generate(5));
    }

    @Test
    public void shouldGiveEmptyWhenZeroRow() {
        List<List<Integer>> expected = Lists.newArrayList(Lists.newArrayList());
        assertEquals(expected, fixture.generate(0));
    }

}
