class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode oddHead = head;
        ListNode evenHead = head.next;
        ListNode odd = oddHead;
        ListNode even = evenHead;
        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = null;
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        ListNode dEven = evenHead;
        ListNode dOdd = oddHead;
        while (dEven != null && dOdd != null) {
            curr.next = dEven;
            dEven = dEven.next;
            curr = curr.next;
            curr.next = dOdd;
            dOdd = dOdd.next;
            curr = curr.next;
        }
        if (dOdd != null) {
            curr.next = dOdd;
        }
        return dummy.next;
    }
}