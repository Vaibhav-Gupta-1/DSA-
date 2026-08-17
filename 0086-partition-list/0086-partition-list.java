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
    public ListNode partition(ListNode head, int x) {
        ListNode d1 = new ListNode(-1);
        ListNode t1 = d1;
        ListNode d2 = new ListNode(-1);
        ListNode t2 = d2;
        ListNode temp = head;
        while(temp!=null){
            if(temp.val<x){
                t1.next = temp;
                t1 = t1.next;
            }
            else{
                t2.next = temp;
                t2 = t2.next;
            }
            temp=temp.next;
        }
        t1.next = d2.next;
        t2.next = null;
        // while(tail2.next!=null){
        //     tail2=tail2.next;
        // }
        // tail1.next = d2.next;
        // tail2.next = null;
        // ListNode tail1 = d1;
        // while(tail1.next!=null){
        //     tail1=tail1.next;
        // }
        return d1.next;
    }
}