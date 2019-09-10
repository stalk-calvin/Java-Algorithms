/*
 * Copyright Calvin Lee Since 2017.
 * All Rights Reserved.
 */

package org.calvin.String;

import com.google.common.collect.Lists;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

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

    @Test public void shouldCalculatePointsMyWayAnother() throws Exception {
        List<String> input = Lists.newArrayList("5","-2","4","C","D","9","+","+");
        assertEquals(27, fixture.getSumBaseball(input));
    }

    @Test public void shouldCalculatePointsMyWay() throws Exception {
        List<String> input = Lists.newArrayList("5","2","C","D","+");
        assertEquals(30, fixture.getSumBaseball(input));
    }

    @Test public void shouldCalculatePointsWithStartingPlusMyWay() throws Exception {
        List<String> input = Lists.newArrayList("+","5","-2","4","C","8","+");
        assertEquals(17, fixture.getSumBaseball(input));
    }

    @Test public void shouldCalculatePointsWithStartingCMyWay() throws Exception {
        List<String> input = Lists.newArrayList("C","5","-2","4","C","8","+");
        assertEquals(17, fixture.getSumBaseball(input));
    }

    @Test public void shouldCalculatePointsWithStartingDMyWay() throws Exception {
        List<String> input = Lists.newArrayList("D","5","-2","4","C","8","+");
        assertEquals(17, fixture.getSumBaseball(input));
    }
}
