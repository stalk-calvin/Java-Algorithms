package org.calvin.String;

public class LookAndSay {
    public String lookAndSay(final String number) {
        if (number == null || number.isEmpty()) {
            return "";
        }
        int firstCharPosition = 0;
        final StringBuilder result = new StringBuilder();
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(firstCharPosition) != number.charAt(i)) {
                final String digitsFound = number.substring(firstCharPosition, i);
                result.append(digitsFound.length()).append(number.charAt(firstCharPosition));
                firstCharPosition = i;
            }
        }
        result.append(number.substring(firstCharPosition, number.length()).length()).append(number.charAt(firstCharPosition));
        return result.toString();
    }


}
