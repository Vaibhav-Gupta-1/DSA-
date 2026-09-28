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
    public ListNode doubleIt(ListNode head) {
        ListNode reversedHead = reverse(head);
        ListNode curr = reversedHead;
        ListNode prev = null;
        int carry = 0;
        while (curr != null) {
            int total = curr.val * 2 + carry;
            curr.val = total % 10;
            carry = total / 10;
            prev = curr;
            curr = curr.next;
        }
        if (carry > 0) {
            prev.next = new ListNode(carry);
        }
        return reverse(reversedHead);
    }
    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }
}