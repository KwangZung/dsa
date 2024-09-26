 static void printLinkedList(SinglyLinkedListNode head) {
        SinglyLinkedListNode a = head;
        System.out.println(a.data);
        while (a.next != null)
        {
            a = a.next;
            System.out.println(a.data);
        }

    }