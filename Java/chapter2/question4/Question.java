public class Question {
    LinkedListNode partition(LinekdListNode node, int x) {
        LinkedListNode beforeStart = null; 
        LinekdListNode beforeEnd = null;
        LinkedListNode afterStart = null; 
        LinkedListNode afterEnd = null; 

        while (node != null) {
            LinkedListNode next = node.next;
            node.next = null; 

            if (node.data < x) {
                if (beforeStart == null) {
                    beforeStart = node;
                    beforeEnd = beforeStart;
                } else {
                    beforeEnd.next = node;
                    beforeEnd = node;
                }
            } else {
                if (afterStart == null) {
                    afterStart = node;
                    afterEnd = afterStart;
                } else {
                    afterEnd.next = node;
                    afterEnd = afterStart;
                }
            }
            
            node = next;
        }

        if (beforeStart == null) {
            return afterStart;
        }

        beforeEnd.next = afterStart;
        return beforeStart;
    }
    
}
