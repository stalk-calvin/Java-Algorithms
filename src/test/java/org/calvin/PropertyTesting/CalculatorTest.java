/*
 * Copyright Calvin Lee Since 2017.
 * All Rights Reserved.
 */

package org.calvin.PropertyTesting;

import static org.junit.Assert.assertEquals;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;
import org.junit.Before;
import org.junit.runner.RunWith;

@RunWith(JUnitQuickcheck.class)
public class CalculatorTest {
    private Calculator fixture;

    @Before public void setUp() throws Exception {
        fixture = new Calculator();
    }

    @Property(trials = 5)
    public void shouldAddNumbers(int number) throws Exception {
        int expectedInitial = fixture.getResult();
        fixture.add(number);
        assertEquals(expectedInitial + number, fixture.getResult());
    }

    @Property(trials = 5)
    public void shouldSubtractNumbers(int number) throws Exception {
        int expectedInitial = fixture.getResult();
        fixture.subtract(number);
        assertEquals(expectedInitial - number, fixture.getResult());
    }
}
