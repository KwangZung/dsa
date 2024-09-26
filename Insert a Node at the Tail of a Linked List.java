static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        
        if (head == null) {
            SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
            return newNode;
        }
        else {
            SinglyLinkedListNode cur = head;
            while (cur.next != null) {
                cur = cur.next;
            }
            SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
            cur.next = newNode;
        }
        return head;