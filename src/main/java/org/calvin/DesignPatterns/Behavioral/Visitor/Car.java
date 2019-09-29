/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.DesignPatterns.Behavioral.Visitor;

class Car implements CarElement{
    private CarElement[] elements;

    public CarElement[] getElements() {
        return elements.clone(); // Return a copy of the array of references.
    }

    public Car() {
        this.elements = new CarElement[]
                { new Wheel("front left"), new Wheel("front right"),
                        new Wheel("back left") , new Wheel("back right"),
                        new Body(), new Engine() };
    }

    public void accept(CarElementVisitor visitor) {
        for(CarElement element : this.getElements()) {
            element.accept(visitor);
        }
        visitor.visit(this);
    }
}
