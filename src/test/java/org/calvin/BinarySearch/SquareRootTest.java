/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.BinarySearch;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SquareRootTest {
    private SquareRoot fixture;

    @BeforeEach
    public void setUp() throws Exception {
        fixture = new SquareRoot();
    }

    @Test
    public void shouldCalculateSquareRoot() throws Exception {
        int actual = fixture.mySqrt(4);
        assertEquals(2, actual);
    }

    @Test
    public void shouldZeroBeZero() throws Exception {
        int actual = fixture.mySqrt(0);
        assertEquals(0, actual);
    }

    @Test
    public void shouldCalculateSquareRootBigNumber() throws Exception {
        int actual = fixture.mySqrt(1600);
        assertEquals(40, actual);
    }

    @Test
    public void shouldNotCalculateSquareRootBigNumber() throws Exception {
        int actual = fixture.mySqrt(4, 10, 0);
        assertEquals(0, actual);
    }

}
