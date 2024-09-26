 public static SinglyLinkedListNode deleteNode(SinglyLinkedListNode llist, int position) {
    // Write your code here
    SinglyLinkedListNode cur = llist;
    
    if (llist == null || llist.next == null) return null;
    if (position == 0) return llist.next;
    
    for (int i=0; i<position-1; i++) cur = cur.next;
    cur.next = cur.next.next;
    return llist;

    }