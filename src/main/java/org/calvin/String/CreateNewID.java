package org.calvin.String;

import com.google.common.base.Strings;
import com.google.common.collect.Sets;

import java.util.Set;

public class CreateNewID {
    public static String createNewID(String newID) {
        String mutatedNewID = newID.toLowerCase();
        mutatedNewID = shouldContainOneDot(mutatedNewID);
        mutatedNewID = shouldContainOnlyAllowed(mutatedNewID.toCharArray());
        mutatedNewID = removeFrontEndPeriod(mutatedNewID);
        if (mutatedNewID.isEmpty()) {
            return Strings.repeat("a", newID.length());
        } else if (mutatedNewID.length() > 15) {
            mutatedNewID = mutatedNewID.substring(0, 15);
        } else if (mutatedNewID.length() < 3) {
            char[] toCharArray = mutatedNewID.toCharArray();
            while (mutatedNewID.length() < 3) {
                mutatedNewID = mutatedNewID + toCharArray[mutatedNewID.length()-1];
            }
        }
        mutatedNewID = removeFrontEndPeriod(mutatedNewID);
        return mutatedNewID;
    }

    private static String removeFrontEndPeriod(String newID) {
        while (newID.length()>0 && newID.toCharArray()[0] == '.') {
            newID = newID.substring(1);
        }
        while (newID.length()>0 && newID.toCharArray()[newID.length()-1] == '.') {
            newID = newID.substring(0,newID.length()-1);
        }
        return newID;
    }

    private static String shouldContainOneDot(String newID) {
        return newID.replaceAll("\\.\\.+", ".");
    }

    private static String shouldContainOnlyAllowed(char[] charArray) {
        Set<Character> allowed = Sets.newHashSet('-', '_', '.');
        StringBuilder sb = new StringBuilder();
        for (char c : charArray) {
            int ord = (int) c;
            // allowed
            if (ord > 96 && ord < 123 || ord > 48 && ord < 58 || allowed.contains(c)) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
