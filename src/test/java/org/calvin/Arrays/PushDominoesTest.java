package org.calvin.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class PushDominoesTest {
    @Test
    public void pushDominoes() {
        assertEquals("..RR.LL..RR", PushDominoes.pushDominoes("..R...L..R."));
        assertEquals("..R.L.R", PushDominoes.pushDominoes("..R.L.R"));
        assertEquals(".LL..R", PushDominoes.pushDominoes("..L..R"));
        assertEquals("LL.RRR", PushDominoes.pushDominoes(".L.R.R"));
        assertEquals("LL.LL.R.L", PushDominoes.pushDominoes(".L..L.R.L"));
    }
}