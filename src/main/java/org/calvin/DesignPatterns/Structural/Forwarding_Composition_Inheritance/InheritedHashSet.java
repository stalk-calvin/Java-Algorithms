package org.calvin.DesignPatterns.Structural.Forwarding_Composition_Inheritance;

import java.util.Collection;
import java.util.HashSet;

public class InheritedHashSet<E> extends HashSet<E> {
    // The number of attempted element insertions
    private int addCount = 0;
    public InheritedHashSet() {
    }
    public InheritedHashSet(int initCap, float loadFactor) {
        super(initCap, loadFactor);
    }

    @Override public boolean add(E e) {
        addCount++;
        return super.add(e);
    }
    @Override public boolean addAll(Collection<? extends E> c) { addCount += c.size();
        return super.addAll(c);
    }
    public int getAddCount() {
        return addCount;
    }
}