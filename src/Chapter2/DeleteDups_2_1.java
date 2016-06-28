package Chapter2;

import javax.xml.soap.*;
import java.util.LinkedList;

/**
 * Created by Youngmin on 2016. 6. 27..
 */

// Write code to remove duplicates from an unsorted linked list
// How would you solve this problem if a temporary buffer is not allowed?
public class DeleteDups_2_1 {

    public static void main(String[] args) {
        Node n1 = new Node(3);
        n1.appendToTail(3);
        n1.appendToTail(5);
        n1.appendToTail(6);
        n1.appendToTail(3);

        deleteDups(n1);

        // print
        Node temp = n1;
        while(temp.next != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println(temp.data);
        //

        // System.out.println("test");
        // System.out.println(n1.data);
        // System.out.println(n1.next.data);
        // System.out.println(n1.next.next.data);
        // System.out.println(n1.next.next.next.data);
    }

    public static void deleteDups(Node head) {
        if(head == null) // if there is only one node
            return;

        // takes O(n2)
        Node current = head;
        while(current != null) { // while the outer node is not tail
            Node runner = current;
            while(runner.next != null) { // while the inner node is not tail
                if(runner.next.data == current.data) {
                    runner.next = runner.next.next;
                }
                else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }

    }



}
