public class RemoveFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }
        Set<Integer> tracker = new HashSet<>();
        tracker.add(head.val);
        ListNode tmpHead = head.next;
        ListNode newHead = new ListNode(head.val);
        ListNode result = newHead;
        while (tmpHead != null) {
            if (!tracker.contains(tmpHead.val)) {
                newHead.next = new ListNode(tmpHead.val);
                newHead = newHead.next;
                tracker.add(tmpHead.val);
            }
            tmpHead = tmpHead.next;
        }
        return result;
    }
}
