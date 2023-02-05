package org.calvin.String;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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