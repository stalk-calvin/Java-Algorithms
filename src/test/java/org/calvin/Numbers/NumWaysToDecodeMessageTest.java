package org.calvin.Numbers;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumWaysToDecodeMessageTest {
    @Test
    public void shouldFindNumWays() {
        assertEquals(1, NumWaysToDecodeMessage.numWays("27345"));
        assertEquals(3, NumWaysToDecodeMessage.numWays("12345"));
        assertEquals(8, NumWaysToDecodeMessage.numWays("12123"));
    }
}