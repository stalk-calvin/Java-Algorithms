/*
 * Copyright Calvin Lee Since 2017.
 * All Rights Reserved.
 */

package org.calvin.PropertyTesting;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(JUnitQuickcheck.class)
public class CalculatorTest {
    private Calculator fixture;

    @BeforeEach public void setUp() throws Exception {
        fixture = new Calculator();
    }

    @Property(trials = 5)
    public void shouldAddNumbers(int number) throws Exception {
        int expectedInitial = fixture.getResult();
        fixture.add(number);
        System.out.println("expectedInitial: "+expectedInitial+", number: "+number);
        assertEquals(expectedInitial + number, fixture.getResult());
    }

    @Property(trials = 5)
    public void shouldSubtractNumbers(int number) throws Exception {
        int expectedInitial = fixture.getResult();
        fixture.subtract(number);
        System.out.println("expectedInitial: "+expectedInitial+", number: "+number);
        assertEquals(expectedInitial - number, fixture.getResult());
    }
}
