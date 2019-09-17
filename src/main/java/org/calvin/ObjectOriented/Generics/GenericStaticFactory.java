package org.calvin.ObjectOriented.Generics;

import java.util.HashMap;

public class GenericStaticFactory {
    public static <K, V> HashMap<K, V> newHashMap() {
        return new HashMap<K, V>();
    }
}
