package org.calvin.String;

import org.junit.Test;

import static org.junit.Assert.*;

public class CompressStringTest {
    @Test
    public void shouldCompressShortestOne() {
        assertEquals(7, CompressString.compressShortest("aabbaccc"));
    }

    @Test
    public void shouldCompressShortestTwo() {
        assertEquals(9, CompressString.compressShortest("ababcdcdababcdcd"));
    }

    @Test
    public void shouldCompressShortestThree() {
        assertEquals(8, CompressString.compressShortest("abcabcdede"));
    }

    @Test
    public void shouldCompressShortestFour() {
        assertEquals(14, CompressString.compressShortest("abcabcabcabcdededededede"));
    }

    @Test
    public void shouldCompressShortestFive() {
        assertEquals(17, CompressString.compressShortest("xababcdcdababcdcd"));
    }
}