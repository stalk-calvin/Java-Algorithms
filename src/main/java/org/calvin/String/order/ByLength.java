package org.calvin.String.order;

import java.util.Comparator;

class ByLength implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }
}
