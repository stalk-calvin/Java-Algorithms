/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.DesignPatterns.Behaviorial.Visitor;

interface CarElement {
    void accept(CarElementVisitor visitor); // CarElements have to provide accept().
}