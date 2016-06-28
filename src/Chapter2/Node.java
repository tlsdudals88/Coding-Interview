package Chapter2;

/**
 * Created by Youngmin on 2016. 6. 20..
 */

// Singly Linked List
public class Node {

    Node next;
    int data;

    public Node(int d) {
        this.next = null;
        data = d;
    }

    void appendToTail(int d) {
        Node end = new Node(d);
        Node current = this; // this means head node
        while(current.next != null) { // iterate head to tail
            current = current.next;
        }
        current.next = end; // append new node
        end.next = null; // tail node's next node should be null
    }

    Node deleteNode(int d) {

        Node current = this;

        if(current.data == d) { // if you want to remove head node
            return this.next; // change the head pointer
        }

        while(current.next != null) { // while the node is not tail
            if(current.next.data == d) {
                current.next = current.next.next;
                return this; // don't need to change head
            }
            current = current.next;
        }
        return this;
    }
}
