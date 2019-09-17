package org.calvin.Numbers;

public class NumWaysToDecodeMessage {
    public static int numWays(String a) {
        return helper(a, a.length());
    }

    private static int helper(String data, int l) {
        if (l==0) {
            return 1;
        }

        int k = data.length() - l;
        if (data.charAt(k)=='0') {
            return 0;
        }

        int result = helper(data, l-1);
        if (l >= 2 && Integer.parseInt(data.substring(k, k+2)) <= 26) {
            result += helper(data, l-2);
        }

        return result;
    }
}
