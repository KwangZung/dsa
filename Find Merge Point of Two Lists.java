static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode cur1 = head1;
        int node1Num = 0, node2Num = 0;
        SinglyLinkedListNode cur2 = head2;
        while (cur1!=null) {
            node1Num++;
            cur1 = cur1.next;
        }
        while (cur2!=null) {
            node2Num++;
            cur2 = cur2.next;
        }
        SinglyLinkedListNode longlist = new SinglyLinkedListNode(1);
        SinglyLinkedListNode shortlist = new SinglyLinkedListNode(1);
        int shortNum, longNum;
        if (node1Num > node2Num) {
            longlist = head1;
            shortlist = head2;
            longNum = node1Num;
            shortNum = node2Num;
        }
        else {
            longlist = head2;
            shortlist = head1;
            longNum = node2Num;
            shortNum = node1Num;
        }
        SinglyLinkedListNode newHeadOfLong = longlist;
        for (int i=0; i<longNum-shortNum; i++) {
            newHeadOfLong = newHeadOfLong.next;
        } 
        //int ans = longNum-shortNum+1;
        while (shortlist!=null) {
            if (shortlist == newHeadOfLong) return shortlist.data;
            else {
                shortlist = shortlist.next;
                newHeadOfLong = newHeadOfLong.next;
                //ans++;
            }
        }
        return shortlist.data;
}