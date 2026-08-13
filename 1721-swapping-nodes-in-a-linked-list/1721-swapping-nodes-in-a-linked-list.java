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
    public ListNode swapNodes(ListNode head, int k) {
        int len = 0;
        ListNode temp = head;
        while(temp!=null){
            temp=temp.next;
            len++;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode first = dummy;
        ListNode second = dummy;
        for(int i=0;i<=len-k;i++){
            second=second.next;
        }
        for(int i=0;i<k;i++){
            first=first.next;
        }
        int temp1 = first.val;
        first.val=second.val;
        second.val = temp1;

        return dummy.next;
    }
}