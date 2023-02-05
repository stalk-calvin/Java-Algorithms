package org.calvin.String;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringIntegerConversionTest {
    private StringIntegerConversion fixture;

    @BeforeEach
    public void setUp() throws Exception {
        fixture = new StringIntegerConversion();
    }

    @Test
    public void shouldConvertStringToInt() throws Exception {
        int actual = fixture.StringToInt("123");
        assertEquals(123, actual);
    }

    @Test
    public void shouldConvertStringToIntZero() throws Exception {
        int actual = fixture.StringToInt("0");
        assertEquals(0, actual);
    }

    @Test
    public void shouldConvertIntegerToString() throws Exception {
        String actual = fixture.IntegerToString(123);
        assertEquals("123", actual);
    }

    @Test
    public void shouldConvertIntegerToStringZero() throws Exception {
        String actual = fixture.IntegerToString(0);
        assertEquals("0", actual);
    }

    @Test
    public void shouldConvertStringToIntNegative() throws Exception {
        int actual = fixture.StringToInt("-123");
        assertEquals(-123, actual);
    }

    @Test
    public void shouldConvertIntegerToStringNegative() throws Exception {
        String actual = fixture.IntegerToString(-123);
        assertEquals("-123", actual);
    }
}