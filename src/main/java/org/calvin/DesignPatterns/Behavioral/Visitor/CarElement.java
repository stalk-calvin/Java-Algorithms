/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.DesignPatterns.Behavioral.Visitor;

interface CarElement {
    void accept(CarElementVisitor visitor); // CarElements have to provide accept().
}
