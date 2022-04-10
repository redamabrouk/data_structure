package ds.lists;

import ds.nodes.SinglyLinkedNode;

public class SinglyLinkedList<T> {
    SinglyLinkedNode<T> headNode;
/**
 * Insert element at the begining of the list
 * @param data
 */
    public void insertBegin(T data) {
        SinglyLinkedNode<T> temp = new SinglyLinkedNode<T>(data, headNode);
        headNode = temp;
    }
/**
 * Insert element at the end of the list
 * @param data
 */
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

/**
 * 
 * @return
 */    public T removeBegin() {
        if (headNode == null) {
            return null;
        }
        T data = headNode.data;
        headNode = headNode.next;
        return data;
    }
    public T removeEnd() {
        if (headNode == null) {
            return null;
        }
        SinglyLinkedNode<T> curr = headNode;

        // navigate to the last node
        while (curr.next != null) {
            curr = curr.next;
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