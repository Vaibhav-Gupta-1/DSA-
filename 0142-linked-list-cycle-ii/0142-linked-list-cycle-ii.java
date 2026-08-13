/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null||head.next==null)
        return null;
        ListNode slow = head;
        ListNode fast = head;
        int flag = 0;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
            flag = 1;
            break;
            }
        }
        if(flag==1){
        ListNode temp = head;
        while(temp!=null){
            if(temp==slow)
            return temp;
            temp=temp.next;
            slow=slow.next;
            }
        }
        return null;
    }
}