package org.calvin.String;

public class CompressString {
    public static int compressShortest(String input) {
        int size = input.length();
        int upto = size/2 + 1;
        int cnt = 1;
        int shortestSize = Integer.MAX_VALUE;
        while (cnt < upto) {
            int currentSize = compressBy(input, cnt);
            shortestSize = Math.min(currentSize, shortestSize);
            cnt++;
        }
        System.out.println(shortestSize);
        return shortestSize;
    }

    private static int compressBy(String input, int cnt) {
        int size = 0;
        int pos = 0;
        int matched = 1;
        String prevChunk = input.substring(pos, pos+cnt);
        pos+=cnt;
        while (pos < input.length()) {
            int end = Math.min(pos + cnt, input.length());
            String currentChunk = input.substring(pos, end);
            if (prevChunk.equals(currentChunk)) {
                matched++;
            } else {
                size += prevChunk.length();
                if (matched > 1) {
                    size += String.valueOf(matched).length();
                }
                matched = 1;
            }
            pos+=cnt;
            prevChunk = currentChunk;
        }

        size += prevChunk.length();
        if (matched > 1) {
            size += String.valueOf(matched).length();
        }

        return size;
    }
}
