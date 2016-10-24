package playground;

import java.util.Comparator;
import java.util.PriorityQueue;

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
}
public class MergeKSortedList {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length ==0) return null;

        ListNode dummy = new ListNode(-1);
        ListNode runner = dummy;
        PriorityQueue<ListNode> minHeap = new PriorityQueue<ListNode>(lists.length, new Comparator<ListNode>() {
            public int compare(ListNode n1, ListNode n2) {
                return n1.val - n2.val;
            }}
        );
        for(ListNode node:lists) if(node!=null) minHeap.add(node);
        while(!minHeap.isEmpty()){
            ListNode node = minHeap.poll();
            runner.next = node;
            runner = runner.next;
            if(node.next !=null) minHeap.add(node.next);
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode[] list1 = new ListNode[]{new ListNode(9), new ListNode(10)};
        ListNode[] list2 = new ListNode[]{new ListNode(1), new ListNode(2), new ListNode(3)};

        ListNode[] together = new ListNode[list1.length + list2.length];
        System.arraycopy(list1, 0, together, 0, list1.length);
        System.arraycopy(list2, 0, together, list1.length, list2.length);

        MergeKSortedList sorter = new MergeKSortedList();
        ListNode sorted = sorter.mergeKLists(together);
        while (sorted != null) {
            System.out.println(sorted.val);
            sorted = sorted.next;
        }
    }
    /* Output:
    1
    2
    3
    9
   10
   */
}
