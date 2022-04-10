package ds.queues;

import ds.lists.SinglyLinkedList;

public class QueueLinkedList<T> implements Queue<T> {

    private final SinglyLinkedList<T> list = new SinglyLinkedList<T>();

    public QueueLinkedList() {

    }

    public void enqueue(T data) {
        list.insertEnd(data);
    }

    public T dequeue() {
        T temp = list.removeBegin();
        return temp;
    }

    public void print() {
        list.printList();
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        return 0;
    }
}