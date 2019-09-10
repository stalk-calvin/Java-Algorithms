package org.calvin.Arrays;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FallingDominosTest {
    @Test
    public void pushDominoes() {
        assertEquals("..RR.LL..RR", FallingDominos.pushDominoes("..R...L..R."));
        assertEquals("..R.L.R", FallingDominos.pushDominoes("..R.L.R"));
        assertEquals(".LL..R", FallingDominos.pushDominoes("..L..R"));
        assertEquals("LL.RRR", FallingDominos.pushDominoes(".L.R.R"));
        assertEquals("LL.LL.R.L", FallingDominos.pushDominoes(".L..L.R.L"));
    }
}