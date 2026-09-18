class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode nodeA = list1;
        for (int i = 0; i < a - 1; i++) {
            nodeA = nodeA.next;
        }
        ListNode nodeB = nodeA;
        for (int i = 0; i < (b - a + 2); i++) {
            nodeB = nodeB.next;
        }
        nodeA.next = list2;
        ListNode tail2 = list2;
        while (tail2.next != null) {
            tail2 = tail2.next;
        }
        tail2.next = nodeB;
        return list1;
    }
}