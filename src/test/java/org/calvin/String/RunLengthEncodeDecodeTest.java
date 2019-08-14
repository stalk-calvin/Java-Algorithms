package org.calvin.String;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RunLengthEncodeDecodeTest {
    private RunLengthEncodeDecode fixture = new RunLengthEncodeDecode();

    @Test
    public void shouldEncodeText() {
        assertEquals("3A3B4C", fixture.encode("AAABBBCCCC"));
    }

    @Test
    public void shouldNotEncodeSameLength() {
        assertEquals("ABBCCC", fixture.encode("ABBCCC"));
    }

    @Test
    public void shouldDecodeText() {
        assertEquals("AAABBBCCCC", fixture.decode("3A3B4C"));
    }

    @Test
    public void shouldNotDecodeText() {
        assertEquals("ABBCCC", fixture.decode("ABBCCC"));
    }
}