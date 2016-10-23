public class RemoveElement {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;
        if(head.val == val) {
            while(head != null && head.val == val) {
                head = head.next;
            }
        }
        ListNode tmpHead = head;
        ListNode prev = head;
        while (tmpHead != null) {
            if (tmpHead.val == val) {
                if (tmpHead.next != null) {
                    tmpHead.val = tmpHead.next.val;
                    tmpHead.next = tmpHead.next.next;
                    continue;
                } else {
                    prev.next = null;
                }
            }
            prev = tmpHead;
            tmpHead = tmpHead.next;
        }
        return head;
    }
}
