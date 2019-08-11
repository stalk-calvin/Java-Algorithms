package org.calvin.String;

import org.junit.Test;

public class RunLengthEncodeDecodeTest {
    private RunLengthEncodeDecode fixture = new RunLengthEncodeDecode();

    @Test
    public void test() {
        System.out.println(fixture.encode("ABBCCC"));
    }

    @Test
    public void testD() {
        System.out.println(fixture.decode("1D2E1F"));
    }
}