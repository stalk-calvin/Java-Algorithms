/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.DesignPatterns.Creational.AbstractFactory;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComputerFactoryTest {
    ComputerFactory fixture;

    @Before
    public void setup() {
        fixture = new ComputerFactory();
    }

    @Test
    public void shouldGetCorrectComputer() {
        Computer pc = fixture.getComputer(new PCFactory("2 GB","500 GB","2.4 GHz"));
        Computer server = fixture.getComputer(new ServerFactory("16 GB","1 TB","2.9 GHz"));
        assertEquals("2 GB", pc.getRAM());
        assertEquals("16 GB", server.getRAM());
        assertEquals("500 GB", pc.getHDD());
        assertEquals("1 TB", server.getHDD());
        assertEquals("2.4 GHz", pc.getCPU());
        assertEquals("2.9 GHz", server.getCPU());

    }
}
