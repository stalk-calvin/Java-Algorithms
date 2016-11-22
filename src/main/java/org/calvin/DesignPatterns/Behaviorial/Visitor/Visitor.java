/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.DesignPatterns.Behaviorial.Visitor;

public interface Visitor{
    public void visit(Book book);

    //visit other concrete items
    public void visit(CD cd);
    public void visit(DVD dvd);
}