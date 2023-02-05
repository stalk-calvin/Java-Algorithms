package org.calvin.Numbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BaseConverterTest {

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
    public void shouldNotConvertFromDecimalOverLimit() {
        Exception exception =
                assertThrows(Exception.class, () ->
                        BaseConverter.baseFromDecimalToString(1001, 37));
        assertEquals("Bases greater than 36 not handled", exception.getMessage());
    }

    @Test
    public void shouldNotConvertFromDecimalUnderLimit() {
        Exception exception =
                assertThrows(Exception.class, () ->
                        BaseConverter.baseFromDecimalToString(1001, 1));
        assertEquals("Bases less than 2 not handled", exception.getMessage());
    }

    @Test
    public void shouldConvertNegativeToAnyBaseString() throws Exception {
        assertEquals("-3E9", BaseConverter.baseFromDecimalToString(-1001, 16));
    }

    @Test
    public void shouldNotConvertToDecimalFromAnyBase() {
        assertEquals(-1, BaseConverter.toDecimal("6", 2));
    }
}