class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode head2 = slow.next; 
        slow.next = null;            
        ListNode curr = head2;
        ListNode prev = null;
        ListNode next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        ListNode temp = head;
        ListNode temp2 = prev;         
        while (temp2 != null) {
            ListNode next1 = temp.next;  
            ListNode next2 = temp2.next; 
            temp.next = temp2;           
            temp2.next = next1;          
            temp = next1;
            temp2 = next2;
        }
    }
}