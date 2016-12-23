package org.calvin.Numbers;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindMinimumNumberTest {
    private FindMinimumNumber fixture;

    @Before
    public void setUp() {
        fixture = new FindMinimumNumber();
    }

    @Test
    public void shouldFindMin() {
        int[] input = {3,4,5,1,2};
        int actual = fixture.findMin(input);
        assertEquals(1,actual);
    }

    @Test
    public void shouldFindMinDuplicated() {
        int[] input = {3,3,4,5,5,1,2,2};
        int actual = fixture.findMin(input);
        assertEquals(1,actual);
    }

}