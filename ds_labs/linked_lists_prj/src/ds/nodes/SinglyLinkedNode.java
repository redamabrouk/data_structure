package ds.nodes;

public class SinglyLinkedNode <T>{
    public T data;
    public SinglyLinkedNode<T> next;
    public SinglyLinkedNode(T data,SinglyLinkedNode<T> next_node){
        this.data = data;
        next=next_node;

    }
    public SinglyLinkedNode(T data){
        this.data = data;

    }

}
