package org.calvin.Utils;

import java.lang.ref.WeakReference;

public class GCTest {
    private final static int ALLOC_SIZE = (int) (2147483648 * 0.60);

    public void allocate() {
        System.out.println("Before first allocation");
        byte[] b = new byte[ALLOC_SIZE];
        System.out.println("After first allocation");

        System.out.println("Before second allocation");
        byte[] b2 = new byte[ALLOC_SIZE];
        System.out.println("After second allocation");
    }

    public byte[] weakAllocate() {
        System.out.println("Before first allocation");
        WeakReference<byte[]> b = new WeakReference<byte[]>(new byte[ALLOC_SIZE]);
        System.out.println("After first allocation");

        System.out.println("b is alive ? " + b.get());
        System.out.println("Before second allocation");
        byte[] b2 = new byte[ALLOC_SIZE];
        System.out.println("After second allocation");
        System.out.println("b is alive ? " + b.get());

        return b.get();
    }
}
