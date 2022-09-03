/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode() {} ListNode(int val) { this.val = val; } ListNode(int val,
 * ListNode next) { this.val = val; this.next = next; } }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode nextHead = head;
        int count = 0;
        while (nextHead != null && count != k) {
            nextHead = nextHead.next;
            count++;
        }
        if (count != k) {
            return head;
        }
        ListNode newHead = reverseKGroup(nextHead, k);
        while (count-- > 0) {
            ListNode tmp = head.next;
            head.next = newHead;
            newHead = head;
            head = tmp;
        }
        return newHead;
    }
}
