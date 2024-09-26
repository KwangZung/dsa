public static DoublyLinkedListNode reverse(DoublyLinkedListNode llist) {
    // Write your code here
        DoublyLinkedListNode cur = llist;
        DoublyLinkedListNode tmp = cur.next;
        DoublyLinkedListNode ans = cur;
        while (cur!=null) {
            ans = cur;
            cur = cur.next;
            tmp = ans.next;
            ans.next = ans.prev;
            ans.prev = tmp;
            
        }
        return ans;
    }
