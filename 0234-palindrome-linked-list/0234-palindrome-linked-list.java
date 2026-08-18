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
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode shead = slow;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode temp = slow.next;
        slow.next= null;
        ListNode curr = temp;
        ListNode prev = null;
        ListNode frwd = curr;
        while(curr != null){
            frwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = frwd;
        }
        while(prev!=null){
            if(prev.val!=shead.val){
                return false;
            }
            prev = prev.next;
            shead = shead.next;
        }
        return true;
    }
}