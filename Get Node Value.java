public static int getNode(SinglyLinkedListNode llist, int positionFromTail) {
    // Write your code here
        SinglyLinkedListNode cur = llist;
        Vector <Integer> datas = new Vector<>();
        while (cur!=null) {
            datas.add(cur.data);
            cur = cur.next;
        }
        return datas.get(datas.size()-1-positionFromTail);
    }