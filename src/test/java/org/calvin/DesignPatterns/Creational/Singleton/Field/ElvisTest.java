/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.DesignPatterns.Creational.Singleton.Field;

import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class ElvisTest {
    @Test
    public void shouldSetFirstNameCorrectly() {
        PrintStream ps = mock(PrintStream.class);
        System.setOut(ps);
        Elvis elvis = Elvis.INSTANCE;
        elvis.leaveTheBuilding();
        verify(ps).println("Whoa baby, I'm outta here!");
    }
}
