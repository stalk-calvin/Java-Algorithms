package org.calvin.String;

import org.junit.Test;

import static org.junit.Assert.*;

public class BuddyStringTest {

    @Test
    public void isBuddyString() {
        assertTrue(BuddyString.isBuddyString("ab","ba"));
        assertFalse(BuddyString.isBuddyString("ab","ab"));
        assertTrue(BuddyString.isBuddyString("aa","aa"));
        assertTrue(BuddyString.isBuddyString("aaaaaaabc","aaaaaaacb"));
        assertFalse(BuddyString.isBuddyString("","aa"));
    }
}