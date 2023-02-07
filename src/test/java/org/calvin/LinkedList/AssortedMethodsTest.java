package org.calvin.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AssortedMethodsTest {
  @Test
  public void shouldCreateRandomLinkedList() {
    int[] vals = {3, 3, 3};
    ListNode<Integer> expected = AssortedMethods.createLinkedListFromArray(vals);
    ListNode<Integer> actual = AssortedMethods.randomLinkedList(3, 3, 3);
    assertEquals(expected,actual);
  }

  @Test
  public void linkedListWithValue() {
    int[] vals = {3, 3, 3};
    ListNode<Integer> expected = AssortedMethods.createLinkedListFromArray(vals);
    ListNode<Integer> actual = AssortedMethods.linkedListWithValue(3, 3);
    assertEquals(expected,actual);
  }

  @Test
  public void shouldCreateLinkedListFromArray() {
    int[] vals = {3, 3, 3};
    ListNode<Integer> actual = AssortedMethods.createLinkedListFromArray(vals);
    int count = 0;
    while (actual != null) {
      assertTrue(vals[count] == actual.getVal());
      actual = actual.getNext();
      count++;
    }
  }
}