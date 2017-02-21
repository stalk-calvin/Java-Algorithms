/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.DesignPatterns.Creational.AbstractFactory;

public class ComputerFactory {
    public Computer getComputer(ComputerAbstractFactory factory){
        return factory.createComputer();
    }
}
