/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.DesignPatterns.Behaviorial.Visitor;

public interface Visitable{
    public void accept(Visitor visitor);
}

