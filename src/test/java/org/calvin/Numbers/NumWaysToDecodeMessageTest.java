package org.calvin.Numbers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NumWaysToDecodeMessageTest {
    @Test
    public void shouldFindNumWays() {
        assertEquals(1, NumWaysToDecodeMessage.numWays("27345"));
        assertEquals(3, NumWaysToDecodeMessage.numWays("12345"));
        assertEquals(8, NumWaysToDecodeMessage.numWays("12123"));
    }
}