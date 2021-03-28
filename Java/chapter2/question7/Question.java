public class Question {
    LinkedListNode findIntersection(LinkedListNode list1, LinkedListNode list2) {
        if (list 1 == null || list2 == null) return null;

        Result result1 = getTailAndSize(list1);
        Result result2 = getTailAndSize(list2);

        if (result1.tail != result2.tail) {
            return null;
        }

        LinkedListNode shorter = result1.size < result2.size : list1 : list2;
        LinkedListNode longer = result1.size < result2.size : list2 : list1;

        longer = getKthNode(longer, Math.abs(result1.size - result2.size));

        while (shorter != longer) {
            shorter = shorter.next;
            longer = longer.next;
        }

        return longer;
    }

    Result getTailAndSize(LinkedListNode list) {
        if (list == null) return null; 
        
        int size = 1; 

        LinkedListNode cur = list; 

        while (cur.next != null) {
            cur = cur.next; 
            size++;
        }

        return new Result(cur, size);
    }

    LinkedListNode getKthNode(LinkedListNode head, int k) {
        LinkedListNode cur = head; 

        int size = k; 

        while (size > 0) {
            size--; 
            cur = cur.next; 
        }

        return cur; 
    }
}
