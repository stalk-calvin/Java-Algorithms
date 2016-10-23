public class Reverse {
    public String reverseString(String s) {
        char[] charArray = s.toCharArray();
        int start = 0;
        int end = charArray.length - 1;
        while (start <= end) {
            char tmp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = tmp;
            start++;
            end--;
        }
        return new String(charArray);
    }
}
