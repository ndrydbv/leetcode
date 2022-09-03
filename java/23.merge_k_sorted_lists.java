import java.util.PriorityQueue;

public class ListNodeCom implements Comparator<ListNode> {
    public int compare(ListNode n1, ListNode n2) {
        if (n1.val > n2.val)
            return 1;
        else if (n1.val < n2.val)
            return -1;
        else
            return 0;
    }
}

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode dummy = new ListNode();
        ListNode d = dummy;
        PriorityQueue<ListNode> pq = new PriorityQueue(new ListNodeCom());

        for (int i = 0; i < lists.length; i++) {
            if (lists[i] != null) {
                pq.add(lists[i]);
            }
        }
        while (!pq.isEmpty()) {
            ListNode temp = pq.poll();

            dummy.next = temp;
            dummy = dummy.next;
            if (temp.next != null) {
                pq.add(temp.next);
            }
        }
        return d.next;
    }
}
