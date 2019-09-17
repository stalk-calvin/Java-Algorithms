package org.calvin.ObjectOriented.Generics;

import java.util.ArrayList;
import java.util.List;

public class Reduction {
    // Wildcard type for parameter that serves as an E producer
    static <E> E reduce(List<? extends E> list, Function<E> f, E initVal) {
        List<E> snapshot;
        synchronized (list) {
            snapshot = new ArrayList<E>(list);
        }
        E result = initVal;
        for (E e : snapshot)
            result = f.apply(result, e);
        return result;
    }

    public static final Function<Number> MAX =
            (n1, n2) -> Double.compare(n1.doubleValue(), n2.doubleValue()) > 0 ? n1 : n2;

    public static final Function<Number> SUM = (i1, i2) -> i1.doubleValue() + i2.doubleValue();

    public static final Function<Number> PRODUCT = (i1, i2) -> i1.doubleValue() * i2.doubleValue();
}
