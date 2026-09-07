class Solution {
    public Node deepCopy(Node head1) {
        if (head1 == null) return null;
        Node temp1 = head1;
        Node head2 = new Node(-1);
        Node temp2 = head2;
        while (temp1 != null) {
            Node t = new Node(temp1.val);
            temp2.next = t;
            temp2 = temp2.next;
            temp1 = temp1.next;
        }
        return head2.next;
    }

    public void merge(Node head1, Node head2) {
        Node temp1 = head1;
        Node temp2 = head2;
        while (temp1 != null && temp2 != null) {
            Node next1 = temp1.next;
            Node next2 = temp2.next;

            temp1.next = temp2;
            temp2.next = next1;

            temp1 = next1;
            temp2 = next2;
        }
    }

    public void randomConnection(Node head1) {
        Node temp1 = head1;
        while (temp1 != null) {
            Node temp2 = temp1.next;
            if (temp1.random != null) {
                temp2.random = temp1.random.next;
            }
            temp1 = temp2.next;
        }
    }

    public void split(Node head1) {
        Node temp1 = head1;
        while (temp1 != null) {
            Node temp2 = temp1.next;
            temp1.next = temp2.next;
            if (temp2.next != null) {
                temp2.next = temp2.next.next;
            }
            temp1 = temp1.next;
        }
    }

    public Node copyRandomList(Node head1) {
        if (head1 == null) return null;
        Node head2 = deepCopy(head1);
        merge(head1, head2);
        randomConnection(head1);
        split(head1);
        return head2;
    }
}