/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MajorityElementTest {
    MajorityElement fixture;

    @BeforeEach
    public void setUp() {
        fixture = new MajorityElement();
    }

    @Test
    public void shouldBeMajorityElement() {
        int[] input = {1,2,2,2,3};
        assertEquals(2, fixture.majorityElement(input));
    }

    @Test
    public void shouldBeMajorityElementLinear() {
        int[] input = {2,2,2,6,7,7};
        assertEquals(2, fixture.majorityElementLinear(input));
    }

    @Test
    public void shouldUnsortedBeMajorityElement() {
        int[] input = {2,1,2,3,2};
        assertEquals(2, fixture.majorityElement(input));
    }

    @Test
    public void shouldUnsortedBeMajorityElementLinear() {
        int[] input = {2,1,2,3,2};
        assertEquals(2, fixture.majorityElementLinear(input));
    }
}
