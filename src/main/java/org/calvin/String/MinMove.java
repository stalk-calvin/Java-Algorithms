/*
 * Copyright Calvin Lee Since 2017.
 * All Rights Reserved.
 */

package org.calvin.String;

import java.util.ArrayList;
import java.util.List;

public class MinMove {
    public int minMove(String a, String b) {
        //count chars
        List<NamedObject> aInfo = getNamedObject(a);
        List<NamedObject> bInfo = getNamedObject(b);

        if (aInfo.size() != bInfo.size()) return -1;
        int minMove = 0;
        for (int i = 0; i < aInfo.size(); i++) {
            minMove += Math.abs(aInfo.get(i).occurrence - bInfo.get(i).occurrence);
        }

        return minMove;
    }

    private List<NamedObject> getNamedObject(String a) {
        List<NamedObject> result = new ArrayList<>();
        char prev = a.charAt(0);
        int count = 1;
        for (int i = 1; i < a.length(); i++) {
            if (prev == a.charAt(i)) {
                count++;
            } else {
                result.add(new NamedObject(prev, count));
                count = 1;
                prev = a.charAt(i);
            }
            if (i == a.length() - 1) {
                result.add(new NamedObject(prev, count));
            }
        }

        return result;
    }
}

class NamedObject {
    public final Character name;
    public final Integer occurrence;

    public NamedObject(Character name, Integer occurrence) {
        this.name = name;
        this.occurrence = occurrence;
    }
}
