/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.DesignPatterns.Behaviorial.Visitor;

import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Visitable> items;
    public double calculatePostage() {
        PostageVisitor visitor = new PostageVisitor();

        for(Visitable item: items) {
            item.accept(visitor);
        }

        return visitor.getTotalPostage();
    }
}