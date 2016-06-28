package Chapter2;

/**
 * Created by Youngmin on 2016. 6. 27..
 */

// implement an algorithm to delete a node in the middle of a singly linked list,
// given only access to that node
// the problem is you are not given access to the head of the linked list.
// Input: A->B->C->D->E. you have to delete node C.
// Constrain: You have only access to the node to be deleted (node C).

public class DeleteNode_2_3 {
    public static void main(String[] args) {

        Node n1 = new Node(1);
        n1.appendToTail(2);
        n1.appendToTail(3);
        n1.appendToTail(4);
        n1.appendToTail(5);

        Node middle = n1.next.next;

        deleteNode(middle);
        System.out.println(middle.data);
    }

    public static void deleteNode(Node n) {

        if(n == null) {
            System.out.println("cannot delete");
            return;
        }
        if(n.next == null) {
            System.out.println("cannot delete");
            return;
        }

        Node next = n.next;
        n.data = next.data;
        n.next = next.next;
    }
}
