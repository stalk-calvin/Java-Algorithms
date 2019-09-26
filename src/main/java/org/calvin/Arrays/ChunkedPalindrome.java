package org.calvin.Arrays;

public class ChunkedPalindrome {
    static int chunkedPalindrome(String str) {
        int count = 0;

        int i, j, x, y;
        i = 0;
        j = 1;
        y = str.length();
        x = y - 1;

        while (i <= x) {
            if (i == x) {
                count++;
                break;
            }

            String s1 = str.substring(i, j);
            String s2 = str.substring(x, y);
            if (s1.equals(s2)) {
                count += 2;
                i = j;
                j++;
                y = x;
                x--;
            }
            else {
                j++;
                x--;
            }
        }
        return count;
    }
}
