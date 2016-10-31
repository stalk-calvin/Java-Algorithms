package org.calvin.String;

public class ReverseVowel {
    public String reverseVowels(String s) {
        String vowels = "aiueo";
        int i = 0;
        int j = s.length() - 1;
        char[] sChars = s.toCharArray();
        while (i < j) {
            if (vowels.contains(Character.toString(s.charAt(i)).toLowerCase()) &&
                    vowels.contains(Character.toString(s.charAt(j)).toLowerCase())) {
                char tmp = sChars[i];
                sChars[i++] = sChars[j];
                sChars[j--] = tmp;
            } else if (!vowels.contains(Character.toString(s.charAt(j)).toLowerCase())) {
                j--;
            } else if (!vowels.contains(Character.toString(s.charAt(i)).toLowerCase())) i++;
        }
        return new String(sChars);
    }
}
