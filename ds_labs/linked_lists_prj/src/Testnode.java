import javax.print.attribute.IntegerSyntax;

import ds.nodes.Node;

public class Testnode {
    public static void main(String[] args) {
        Node<String> n1, n2, n3, n4;
        n1 = new  Node<String>("A");
        n2 = new  Node<String>("B");
        n3 = new  Node<String>("C");
        n4 = new  Node<String>("D");
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        // numerals = new Node(1, new Node(2, new Node(3, null)));
        Node<String> n = n1;
        while (n != null) {
            System.out.print(n.data + "  ");
            n = n.next;
        }
        n = n1;
        System.out.println();
        System.out.println("========================");
        while (n != null) {
            System.out.print(n.data + "  ");
            n = n.next;
        }
        n1.next = n2;
        n2.next = n4;
        n4.next = n3;
        n3.next = null;
        n = n1;
        System.out.println();
        System.out.println("========================");
        while (n != null) {
            System.out.print(n.data + "  ");
            n = n.next;
        }
    }
}
