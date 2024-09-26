 public static SinglyLinkedListNode reverse(SinglyLinkedListNode llist) {
    // Write your code here
    if (llist == null) return null;
    if (llist.next == null) return llist;
    SinglyLinkedListNode cur = llist;
    Vector <Integer> v = new Vector <>();
    while (cur.next!=null) {
        v.add(cur.data);
        cur = cur.next;
    }
    SinglyLinkedListNode tail = cur;
    int numofNode = v.size();
    for (int i=numofNode-1; i>=0; i--) {
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(v.get(i));
        cur.next = newNode;
        cur = cur.next;
    }
    return tail;
    }
