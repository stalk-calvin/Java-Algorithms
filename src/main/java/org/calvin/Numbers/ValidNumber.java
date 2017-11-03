/*
 * Copyright Calvin Lee Since 2017.
 * All Rights Reserved.
 */

package org.calvin.Numbers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidNumber {
    public boolean isNumber(String s) {
        if (s == null) return false;
        s = s.trim();
        if (s.length() < 1) return false;
        try {
            Integer.parseInt(s);
            return true;
        } catch (Exception e) {
            try {
                Matcher m = Pattern.compile("^(\\d*.?)e(\\d*.?)$").matcher(s);
                if (m.matches()) {
                    return true;
                }

                Double.parseDouble(s);
                return true;
            } catch (Exception ex) {
                return false;
            }
        }
    }

    public boolean isNumberWithoutRegex(String s) {
        s = s.trim();

        boolean pointSeen = false;
        boolean eSeen = false;
        boolean numberSeen = false;
        boolean numberAfterE = true;
        for(int i=0; i<s.length(); i++) {
            if('0' <= s.charAt(i) && s.charAt(i) <= '9') {
                numberSeen = true;
                numberAfterE = true;
            } else if(s.charAt(i) == '.') {
                if(eSeen || pointSeen) {
                    return false;
                }
                pointSeen = true;
            } else if(s.charAt(i) == 'e') {
                if(eSeen || !numberSeen) {
                    return false;
                }
                numberAfterE = false;
                eSeen = true;
            } else if(s.charAt(i) == '-' || s.charAt(i) == '+') {
                if(i != 0 && s.charAt(i-1) != 'e') {
                    return false;
                }
            } else {
                return false;
            }
        }

        return numberSeen && numberAfterE;
    }
}
