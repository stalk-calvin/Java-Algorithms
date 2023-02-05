package org.calvin.Arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ChunkedPalindromeTest {

    @Test
    public void shouldFindChunkedPalindrome() {
        assertEquals(1, ChunkedPalindrome.chunkedPalindrome("a"));
        assertEquals(3, ChunkedPalindrome.chunkedPalindrome("voabcvo"));
        assertEquals(2, ChunkedPalindrome.chunkedPalindrome("vovo"));
        assertEquals(5, ChunkedPalindrome.chunkedPalindrome("volvolvo"));
        assertEquals(6, ChunkedPalindrome.chunkedPalindrome("aaaaaa"));
        assertEquals(7, ChunkedPalindrome.chunkedPalindrome("ghiabcdefhelloadamhelloabcdefghi"));
        assertEquals(11, ChunkedPalindrome.chunkedPalindrome("antaprezatepzapreanta"));
    }
}