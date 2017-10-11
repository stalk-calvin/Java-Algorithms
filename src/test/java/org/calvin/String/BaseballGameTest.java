/*
 * Copyright Calvin Lee Since 2017.
 * All Rights Reserved.
 */

package org.calvin.String;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BaseballGameTest {
    BaseballGame fixture;

    @Before
    public void setUp() {
        fixture = new BaseballGame();
    }

    @Test public void shouldCalculatePoints() throws Exception {
        String[] input = {"5","2","C","D","+"};
        assertEquals(30, fixture.calPoints(input));
    }

    @Test public void shouldCalculatePointsWithStartingPlus() throws Exception {
        String[] input = {"+","5","-2","4","C","8","+"};
        assertEquals(17, fixture.calPoints(input));
    }

    @Test public void shouldCalculatePointsWithStartingC() throws Exception {
        String[] input = {"C","5","-2","4","C","8","+"};
        assertEquals(17, fixture.calPoints(input));
    }

    @Test public void shouldCalculatePointsWithStartingD() throws Exception {
        String[] input = {"D","5","-2","4","C","8","+"};
        assertEquals(17, fixture.calPoints(input));
    }
}
