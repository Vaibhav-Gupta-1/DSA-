/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA = headA;
        ListNode tempB = headB;
        int l1 =0 , l2 = 0;
        while(tempA != null){
            tempA = tempA.next;
            l1++;
        }
        while(tempB != null){
            tempB = tempB.next;
            l2++;
        }
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        if(l1>l2){
            for(int i=0;i<l1-l2;i++){
                temp1 = temp1.next;
            }
        }
        else{
            for(int i=0;i<l2-l1;i++){
                temp2=temp2.next;
            }
        }
        while(temp1!=temp2){
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return temp2;
    }
}