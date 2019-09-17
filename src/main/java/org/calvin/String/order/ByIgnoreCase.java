package org.calvin.String.order;

import java.util.Comparator;

public class ByIgnoreCase implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o1.compareToIgnoreCase(o2);
    }
}
