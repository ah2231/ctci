public class Question {
    /* Reverse and compare */
    public boolean isPalindrom(LinkedListNode head) {
        LinkedListNode reversed = reverseAndClone(head);
        return isEqual(head, reversed);
    }

    LinkedListNode reverseAndClose(LinkedListNode node) {
        LinkedListNode head = null;

        while (node != null) {
            LinkedListNode n = new LinkedListNode(node.data);
            n.next = head;
            head = n;
            node = node.next; 
        }

        return head;
    }

    public boolean isEqual(LInkedListNode one, LinkedListNode two) {
        while (one != null && two != null) {
            if (one.data != two.data) {
                return false;
            }

            one = one.next; 
            two = two.next;
        }

        return one == null && two == null;
    }

    /* Iterative approach */
    public boolean isPalindromeIterative(LinkedListNode head) {
        LinkedListNode fast = head;
        LinkedListNode slow = head;

        Stack<Integer> stack = new Stack<Integer>();

        while (fast != null && fast.next != null) {
            stack.push(slow.data);
            slow = slow.next;
            fast = fast.next.next;                
        }

        if (fast != null) {
            slow = slow.next;
        }

        while (slow != null) {
            int top = stack.pop.value(); 

            if (top != slow.data) {
                return false;
            }

            slow = slow.next;
        }

        return true;
    }

}
