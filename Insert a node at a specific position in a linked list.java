 public static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode llist, int data, int position) {
    // Write your code here
    SinglyLinkedListNode cur = llist;
    if (llist == null) {
        SinglyLinkedListNode head = new SinglyLinkedListNode(data);
        return head;
    }
    if (position == 0) {
        SinglyLinkedListNode newhead = new SinglyLinkedListNode(data);
        newhead.next = llist;
        return newhead;
    }
    for (int i=0; i< position-1 ; i++) {cur = cur.next;}
    SinglyLinkedListNode keeper = cur.next;
    SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
    newNode.next = keeper;
    cur.next = newNode;

    return llist;
}
