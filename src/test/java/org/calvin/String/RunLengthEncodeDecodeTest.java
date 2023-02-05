package org.calvin.String;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
        assertEquals("AAAAAAAAAAAAAFBBBCCCC", fixture.decode("13A1F3B4C"));
    }

    @Test
    public void shouldNotDecodeText() {
        assertEquals("ABBCCC", fixture.decode("ABBCCC"));
    }
}