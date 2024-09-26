static int compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        while (head1 != null && head2 != null) {
            if (head1.data != head2.data) {
                return 0;
            }
            head1 = head1.next;
            head2 = head2.next;
        }
        return (head1 == null && head2 == null) ? 1 : 0;
    }