/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.String;

public class CompareVersion {
    public int compareVersion(String v1, String v2) {
        String[] v1SA = v1.split("\\.");
        String[] v2SA = v2.split("\\.");

        int length = Math.max(v1.length(), v2.length());
        for (int i = 0; i < length; i++) {
            Integer v1t = i < v1SA.length ? Integer.parseInt(v1SA[i]) : 0;
            Integer v2t = i < v2SA.length ? Integer.parseInt(v2SA[i]) : 0;

            int x = v1t.compareTo(v2t);
            if (x != 0) {
                return x;
            }
        }
        return 0;
    }
}
