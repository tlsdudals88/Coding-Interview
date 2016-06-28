package Chapter2;

/**
 * Created by Youngmin on 2016. 6. 27..
 */

// Implement an algorithm to find the kth to last element of a singly linked list

public class nthToLast_2_2 {
    public static void main(String[] args) {

        Node n1 = new Node(1);
        n1.appendToTail(2);
        n1.appendToTail(3);
        n1.appendToTail(4);
        n1.appendToTail(5);
        n1.appendToTail(6);

        nthToLast(n1,3);

    }

    public static void nthToLast(Node head, int k) {

        Node current = head;

        for(int i=0; i<k-1; i++) {
            current = current.next;
        }

        while(current != null) {
            System.out.println(current.data);
            current = current.next;

        }
    }
}
