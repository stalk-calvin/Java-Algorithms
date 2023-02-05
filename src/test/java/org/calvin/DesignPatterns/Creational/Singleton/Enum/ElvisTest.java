/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.DesignPatterns.Creational.Singleton.Enum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ElvisTest {
    Elvis singleton = Elvis.INSTANCE;

    @Test
    public void shouldSetFirstNameCorrectly() {
        singleton.setFname("calvin");
        assertEquals("calvin",singleton.fname);
    }
}
