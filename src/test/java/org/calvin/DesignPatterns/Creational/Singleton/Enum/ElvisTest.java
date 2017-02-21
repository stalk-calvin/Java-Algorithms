/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.DesignPatterns.Creational.Singleton.Enum;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElvisTest {
    Elvis singleton = Elvis.INSTANCE;

    @Test
    public void shouldSetFirstNameCorrectly() {
        singleton.setFname("calvin");
        assertEquals("calvin",singleton.fname);
    }
}
