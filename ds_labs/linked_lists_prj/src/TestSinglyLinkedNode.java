
import ds.lists.SinglyLinkedList;
import ds.nodes.SinglyLinkedNode;

public class TestSinglyLinkedNode {

    public static void main(String[] args) {
        SinglyLinkedList<String> l = new SinglyLinkedList<String>();
        l.insertBegin("Start");
        l.insertEnd("Node1");
        l.insertEnd("Node2");
        l.insertEnd("Node3");
        l.printList();

    }
}