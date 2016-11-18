/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.DesignPatterns.Creational.AbstractFactory;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ComputerFactoryTest {
    @Test
    public void shouldGetCorrectComputer() {
        Computer pc = ComputerFactory.getComputer(new PCFactory("2 GB","500 GB","2.4 GHz"));
        Computer server = ComputerFactory.getComputer(new ServerFactory("16 GB","1 TB","2.9 GHz"));
        assertEquals("2 GB", pc.getRAM());
        assertEquals("16 GB", server.getRAM());
    }

}