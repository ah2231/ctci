package Java.chapter2.question6;

public class QuestionB {
    public Result isPalindromRecurse(LinkedListNode head, int length) {
        if (head == null || length <= ) {
            return new Result(head, true);
        } else if (length == 1) {
            return new Result(head.next, true);
        }
    }
    
    Result res = isPalindromRecurse(head.next, length - 2);

    if (!res.result || res.node == null) {
        return res;
    }

    res.result = (head.data == res.node.data);

    res.node = res.node.next;

    return res;
}

public int lengthOfList(LinkedListNode n) {
    int size = 0;
    while (n != null) {
        size++;
        n = n.next;
    }

    return size;
}

