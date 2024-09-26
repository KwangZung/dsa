public static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode llist, int data) {
    // Write your code here
    DoublyLinkedListNode cur = llist;
    if (cur.data>=data) {
        DoublyLinkedListNode newNode = new DoublyLinkedListNode(data);
        newNode.next = llist;
        llist.prev = newNode;
        return newNode;
    }
    while (cur.next!=null) {
        if (cur.data<data && cur.next.data <= data) cur = cur.next;
        else break;
    }
    DoublyLinkedListNode newNode = new DoublyLinkedListNode(data);
    if (cur. next!=null) {
        newNode.prev = cur;
        newNode.next = cur.next;
        cur.next = newNode;
    }
    else {
        newNode.prev = cur;
        cur.next = newNode;
    }
    return llist;
    }
