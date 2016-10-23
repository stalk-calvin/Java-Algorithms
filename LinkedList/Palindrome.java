public class Palindrome {
    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return true;
        }
        if (head.next == null) {
            return true;
        }
        //algorithm
        //get middle
        ListNode slow = head;
        ListNode fast = slow;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        slow = reverseNode(slow);
        fast = head;
        while (slow != null) {
            if (fast.val != slow.val) {
                return false;
            }
            slow = slow.next;
            fast = fast.next;
        }
        return true;
    }
    private ListNode reverseNode(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode tmpHead = head.next;
        ListNode cur = new ListNode(head.val);
        while(tmpHead != null) {
            ListNode n = new ListNode(tmpHead.val);
            n.next = cur;
            cur = n;
            tmpHead = tmpHead.next;
        }

        return cur;
    }
}
