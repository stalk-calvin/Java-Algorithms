/*
 * Copyright Calvin Lee Since 2019.
 * All Rights Reserved.
 */

package org.calvin.Numbers;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ToBaseTest {
    @Test
    public void testToAnyBaseFromDecimalRecursive() throws Exception {
        assertEquals("21", ToBase.convertRecursive(7, 3));
        assertEquals("22", ToBase.convertRecursive(10, 4));
        assertEquals("34", ToBase.convertRecursive(22, 6));
        assertEquals("40", ToBase.convertRecursive(32, 8));
    }

    @Test
    public void testToAnyBaseFromDecimalIterative() throws Exception {
//        assertEquals("21", ToBase.convertIterative(7, 3));
//        assertEquals("22", ToBase.convertIterative(10, 4));
        assertEquals("34", ToBase.convertIterative(22, 6));
        assertEquals("40", ToBase.convertIterative(32, 8));
    }
}