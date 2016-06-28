package Chapter2;

/**
 * Created by Youngmin on 2016. 6. 20..
 */
public class DoubleNode {

    DoubleNode prev;
    DoubleNode next;
    int data;

    public DoubleNode(int d) {
        this.prev = null;
        this.next = null;
        data = d;
    }

    void appendToTail(int d) {
        DoubleNode end = new DoubleNode(d);
        DoubleNode current = this;
        while(current.next != null) {
            current = current.next;
        }
        current.next = end;
        end.prev = current;
        end.next = null;
    }

    DoubleNode deleteNode(DoubleNode head, int d) {

        DoubleNode current = head;

        if(current.data == d) {
            return head.next;
        }

        while(current.next != null) {
            if(current.next.data == d) {
                DoubleNode temp = current.next.next;
                current.next = current.next.next;
                temp.prev = current;
                return head;
            }
            current = current.next;
        }
        return head;
    }
}
