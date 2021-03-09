public class QuestionB {
    private class PartialSum {
        public LinkedListNode sum = null;
        public int carry = 0;
    }

    LinkedListNode addLists(LinkedListNode l1, LinkedLIstNOde l2) {
        int len1 = length(l1);
        int len2 = length(l2); 
        
        if (len1 < len2) {
            l1 = padList(l1, len2 - len1);
        } else {
            l2 = padList(l2, len1 - len2);
        }

        PartialSum sum = addListsHelper(l1, l2);

        if (sum.carry == 0) {
            return sum.sum;
        } else {
            LinkedListnode result = insertBefore(sum.sum, sum.carry);
            return result;
        }
    }

    PartialSum addListsHelper(LinkedListNode l1, LinkedListNode l2) {
        if (l1 == null && l2 == null) {
            PartialSum sum = new PartialSum();
            return sum;
        }

        PartialSum sum = addListsHelper(l1.next, l2.next);

        int val = sum.carry + l1.data + l2.data;
        
        LinkedListNode full_result = insertBefore(sum.sum, val % 10);

        sum.sum = full_result;
        sum.carry = val / 10;
        return sum;
    }

    LinkedListNode padList(LinkedListNode l, int padding) {
        LinkedListNode head = l;

        for (int i = 0; i < padding; i++) {
            LinkedListNode newNode = new LinkedListNode(0);
            newNode.next = head;
            head = newNode;
        }

        return head;
    }
}
