 public static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode llist) {
    // Write your code here
    SinglyLinkedListNode cur = llist;
    int curdata=cur.data;
    if (cur==null || cur.next==null) return llist;
    else while (cur.next!=null) {
        if (cur.next.data!=curdata) {
            cur = cur.next;
            curdata = cur.data;
        }
        else {
            if (cur.next.next!=null) cur.next = cur.next.next;
            else cur.next = null;
        }
        
    }
    return llist;
    }
