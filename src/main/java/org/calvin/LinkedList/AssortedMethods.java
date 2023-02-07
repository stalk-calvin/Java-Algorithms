package org.calvin.LinkedList;

import static org.calvin.Tree.AssortedMethods.randomIntInRange;

public class AssortedMethods {
  public static ListNode<Integer> randomLinkedList(int N, int min, int max) {
    ListNode<Integer> root = new ListNode<>(randomIntInRange(min, max));
    ListNode<Integer> prev = root;
    for (int i = 1; i < N; i++) {
      int data = randomIntInRange(min, max);
      ListNode<Integer> next = new ListNode<>(data);
      prev.setNext(next);
      prev = next;
    }
    return root;
  }

  public static ListNode<Integer> linkedListWithValue(int N, int value) {
    ListNode<Integer> root = new ListNode<>(value);
    ListNode<Integer> prev = root;
    for (int i = 1; i < N; i++) {
      ListNode<Integer> next = new ListNode<>(value);
      prev.setNext(next);
      prev = next;
    }
    return root;
  }

  public static ListNode<Integer> createLinkedListFromArray(int[] vals) {
    ListNode<Integer> head = new ListNode<>(vals[0]);
    ListNode<Integer> current = head;
    ListNode<Integer> tmpHead = head;
    for (int i = 1; i < vals.length; i++) {
      current = new ListNode<>(vals[i]);
      head.setNext(current);
      head = head.getNext();
    }
    return tmpHead;
  }
}
