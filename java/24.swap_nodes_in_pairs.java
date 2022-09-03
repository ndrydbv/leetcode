/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode cur = dummy;

        while (cur != null && cur.next != null && cur.next.next != null) {
            cur.next = swap(cur.next, cur.next.next);
            cur = cur.next.next;
        }
        return dummy.next;
    }

    private ListNode swap(ListNode n1, ListNode n2) {
        n1.next = n2.next;
        n2.next = n1;
        return n2;
    }
}
