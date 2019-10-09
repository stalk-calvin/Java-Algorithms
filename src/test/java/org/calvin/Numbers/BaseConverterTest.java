package org.calvin.Numbers;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class BaseConverterTest {

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void shouldConvertFromDecimalToAnyBaseString() throws Exception {
        assertEquals("1111101001", BaseConverter.baseFromDecimalToString(1001, 2));
        assertEquals("1101002", BaseConverter.baseFromDecimalToString(1001, 3));
        assertEquals("3E9", BaseConverter.baseFromDecimalToString(1001, 16));
        assertEquals("V9", BaseConverter.baseFromDecimalToString(1001, 32));
    }

    @Test
    public void shouldConvertToDecimalFromAnyBase() {
        assertEquals(1001, BaseConverter.toDecimal("1111101001", 2));
        assertEquals(1001, BaseConverter.toDecimal("1101002", 3));
        assertEquals(1001, BaseConverter.toDecimal("3E9", 16));
        assertEquals(1001, BaseConverter.toDecimal("V9", 32));
    }


    /*
        Support base from 2 to 32.
     */
    @Test
    public void shouldConvertFromBaseToBase() {
        assertEquals("1001", BaseConverter.convertBase("1111101001", 2, 10));
        assertEquals("1001", BaseConverter.convertBase("1101002", 3, 10));
        assertEquals("1001", BaseConverter.convertBase("3E9", 16, 10));
        assertEquals("1001", BaseConverter.convertBase("V9", 32,  10));
    }

    @Test
    public void shouldNotConvertFromDecimalOverLimit() throws Exception {
        exception.expectMessage("Bases greater than 36 not handled");
        BaseConverter.baseFromDecimalToString(1001, 37);
    }

    @Test
    public void shouldNotConvertFromDecimalUnderLimit() throws Exception {
        exception.expectMessage("Bases less than 2 not handled");
        BaseConverter.baseFromDecimalToString(1001, 1);
    }

    @Test
    public void shouldConvertNegativeToAnyBaseString() throws Exception {
        assertEquals("-3E9", BaseConverter.baseFromDecimalToString(-1001, 16));
    }

    @Test
    public void shouldNotConvertToDecimalFromAnyBase() throws Exception {
        assertEquals(-1, BaseConverter.toDecimal("6", 2));
    }
}