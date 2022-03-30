package ds.lists;

import ds.nodes.SinglyLinkedNode;

public class SinglyLinkedList<T> {
    SinglyLinkedNode<T> headNode;

    public void insertBegin(T data) {
        SinglyLinkedNode<T> temp = new SinglyLinkedNode<T>(data, headNode);
        headNode = temp;
    }

    public void insertEnd(T data) {
        SinglyLinkedNode<T> temp = new SinglyLinkedNode<T>(data);
        SinglyLinkedNode<T> curr = headNode;
        // single node
        if (headNode == null) {
            headNode = temp;
            return;
        }
        // navigate to the last node
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = temp;
    }

    // remove
    public T removeBegin() {
        if (headNode == null) {
            return null;
        }
        T data = headNode.data;
        headNode = headNode.next;
        return data;
    }

    
    public void printList() {
        SinglyLinkedNode<T> curr = headNode;
        while (curr != null) {
            System.out.print(curr.data.toString() + " ");
            curr = curr.next;
        }
        System.out.println("");
    }
}