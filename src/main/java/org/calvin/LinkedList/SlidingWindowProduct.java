package org.calvin.LinkedList;

import java.util.LinkedList;

public class SlidingWindowProduct {
    private LinkedList<Integer> storage;
    private int size;
    private int numZeros;
    private Integer product;

    public SlidingWindowProduct(int k) {
        storage = new LinkedList<Integer>();
        size = k;
        product = new Integer(1);
    }

    public void add(int val) {
        if (size < 1) {
            return;
        }
        if (storage.size() >= size) {
            int divisor = storage.pollFirst();
            if (divisor == 0) {
                --numZeros;
            } else {
                product /= divisor;
            }
        }
        if (val == 0) {
            ++numZeros;
        } else {
            product *= val;
        }
        storage.addLast(val);
    }

    public int getProduct() {
        if (size == 0 || numZeros > 0) {
            return 0;
        }
        return product;
    }
}
