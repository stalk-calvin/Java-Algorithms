/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Numbers;

import com.google.common.collect.Lists;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class PascalsTriangle2Test {
    PascalsTriangle2 fixture;

    @Before
    public void setUp() {
        fixture = new PascalsTriangle2();
    }

    @Test
    public void shouldGetRow() {
        List<Integer> expected = Lists.newArrayList(1,4,6,4,1);
        assertEquals(expected, fixture.getRow(4));
    }

}
