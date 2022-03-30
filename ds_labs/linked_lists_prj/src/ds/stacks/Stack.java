package ds.stacks;

import ds.lists.SinglyLinkedList;

public class Stack<T> {
    private final SinglyLinkedList<T> list = new SinglyLinkedList<T>();
    public Stack()
    {

    }
    public void push(T data){
        list.insertEnd(data);
    }
    public T pop(){
        T temp = list.removeBegin();
        return temp;
    }
    public void print(){
        list.printList();
    }
}
