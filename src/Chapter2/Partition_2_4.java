package Chapter2;

/**
 * Created by Youngmin on 2016. 6. 27..
 */

// Write code to partition a linked list around a value x,
// such that all nodes less than x come before all nodes greater than or equal to x

public class Partition_2_4 {
    public static void main(String[] args) {
        Node n1 = new Node(4);
        n1.appendToTail(2);
        n1.appendToTail(8);
        n1.appendToTail(1);
        n1.appendToTail(5);

        Node result = partition(n1, 3);
        // Output: 2,1,4,8,5

        System.out.println(result.data);
        System.out.println(result.next.data);
        System.out.println(result.next.next.data);
        System.out.println(result.next.next.next.data);
        System.out.println(result.next.next.next.next.data);

        /*
        Node temp = result;
        while(temp.next != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
        */

    }


    public static Node partition(Node head, int num) {
        // 1. make 2 linked list
        // 2. marge 2 linked list

        Node beforeStart = null;
        Node beforeEnd = null;
        Node afterStart = null;
        Node afterEnd = null;

        Node current = head;
        // Node mergeList = null;

        while(current != null) {

            Node next = current.next;
            current.next = null;

            if(current.data < num) {
                if(beforeStart == null) { // initial node
                    beforeStart = current;
                    beforeEnd = beforeStart;
                }
                else {
                    beforeEnd.next = current;
                    beforeEnd = current;
                }
            }
            else {
                if(afterStart == null) { // initial node
                    afterStart = current;
                    afterEnd = afterStart;
                }
                else {
                    afterEnd.next = current;
                    afterEnd = current;
                }
            }
            current = next;
        }


/*
        Node temp = beforeStart;
        while(temp.next != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println(temp.data);

        Node temp1 = afterStart;
        while(temp1.next != null) {
            System.out.println(temp1.data);
            temp1 = temp1.next;
        }
        System.out.println(temp1.data);
*/

        beforeEnd.next = afterStart;

        return beforeStart;

    }

}
