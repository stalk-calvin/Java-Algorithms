package org.calvin.terview.epi;

public class Ch3Strings {
    public boolean isPalindromic(String s) {
        for (int i = 0, j = s.length() - 1; i < j; ++i, --j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    public String intToString(int x) {
        boolean isNegative = false;
        if (x < 0) {
            isNegative = true;
        }
        StringBuilder s = new StringBuilder();
        while (x != 0) {
            s.insert(0, Math.abs(x % 10));
            x /= 10;
        }
        if (isNegative) {
            s.append('-'); // Adds the negative sign back.
        }
        return s.toString();
    }

    public int stringToInt(String s) {
        int result = 0;
        for (int i = s.charAt(0) == '-' ? 1 : 0; i < s.length(); ++i) {
            final int digit = s.charAt(i) - '0';
            result = result * 10 + digit;
        }
        return s.charAt(0) == '-' ? -result : result;
    }

    public String convertBase(String numAsString, int b1, int b2) {
        boolean isNegative = numAsString.startsWith("-");
        int numAsInt = 0;
        for (int i = (isNegative ? 1 : 0); i < numAsString.length(); ++i) {
            numAsInt *= b1;
            numAsInt += Character.isDigit(numAsString.charAt(i))
                    ? numAsString.charAt(i) - '0' : numAsString.charAt(i) - 'A' + 10;
        }
        return (isNegative ? "-" : "")
                + (numAsInt == 0 ? "0" : constructFromBase(numAsInt, b2));
    }

    private String constructFromBase(int numAsInt, int base) {
        return numAsInt == 0 ? "" : constructFromBase(numAsInt / base, base) + (char) (numAsInt % base >= 10 ? 'A' + numAsInt % base - 10 : '0' + numAsInt % base);
    }
}
