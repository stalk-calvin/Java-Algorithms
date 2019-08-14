/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.LinkedList;

import org.calvin.Utils.AssortedMethods;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PalindromeTest {
    Palindrome fixture;

    @Before
    public void setUp() {
        fixture = new Palindrome();
    }

    @Test
    public void shouldBePalindrome() {
        int[] vals = {1,2,3,2,1};
        ListNode list1 = AssortedMethods.createLinkedListFromArray(vals);
        assertTrue(fixture.isPalindrome(list1));
    }

    @Test
    public void shouldNotBePalindrome() {
        int[] vals = {1,2,4,3,2,1};
        ListNode list1 = AssortedMethods.createLinkedListFromArray(vals);
        assertFalse(fixture.isPalindrome(list1));
    }

    @Test
    public void shouldNullListBePalindrome() {
        int[] vals = {1};
        ListNode list1 = AssortedMethods.createLinkedListFromArray(vals);
        assertTrue(fixture.isPalindrome(list1));
        assertTrue(fixture.isPalindrome(null));
    }

    @Test
    public void shouldBePalindromeMyWay() {
        int[] vals = {1,2,3,2,1};
        ListNode list1 = AssortedMethods.createLinkedListFromArray(vals);
        assertTrue(fixture.isPalindromeMyWay(list1));
    }

    @Test
    public void shouldNotBePalindromeMyWay() {
        int[] vals = {1,2,4,5,5,4,2,2};
        ListNode list1 = AssortedMethods.createLinkedListFromArray(vals);
        assertFalse(fixture.isPalindromeMyWay(list1));
    }

    @Test
    public void shouldNullListBePalindromeMyWay() {
        int[] vals = {1};
        ListNode list1 = AssortedMethods.createLinkedListFromArray(vals);
        assertTrue(fixture.isPalindromeMyWay(list1));
        assertTrue(fixture.isPalindromeMyWay(null));
    }

}
