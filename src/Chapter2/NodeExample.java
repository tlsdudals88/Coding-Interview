package Chapter2;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by Youngmin on 2016. 6. 20..
 */
public class NodeExample {
    public static void main(String[] args) {

        // Custom Node Class
        Node n1 = new Node(1);
        n1.appendToTail(2);
        n1.appendToTail(3);
        n1.appendToTail(4);
        n1.deleteNode(n1, 2);

        System.out.println(n1.data);
        System.out.println(n1.next.data);
        System.out.println(n1.next.next.data);

        // Java API Node Class
        LinkedList n2 = new LinkedList();
        n2.add(0,"First");
        n2.add(1,"Second");
        n2.addLast("Last1");
        n2.addLast("Last2");
        n2.removeLast();

        System.out.println(n2.get(1));
        System.out.println(n2.getLast());
        System.out.println(n2.getFirst());

    }
}
