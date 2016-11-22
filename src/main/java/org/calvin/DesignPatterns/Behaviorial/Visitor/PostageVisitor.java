/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.DesignPatterns.Behaviorial.Visitor;

public class PostageVisitor implements Visitor {
    private double totalPostageForCart;

    public void visit(Book book) {
        if(book.getPrice() < 10.0) {
            totalPostageForCart += book.getWeight() * 2;
        }
    }

    public void visit(CD cd) {
        System.out.println("Visiting: "+cd);
    }

    public void visit(DVD dvd) {
        System.out.println("Visiting: "+dvd);
    }

    public double getTotalPostage() {
        return totalPostageForCart;
    }
}
