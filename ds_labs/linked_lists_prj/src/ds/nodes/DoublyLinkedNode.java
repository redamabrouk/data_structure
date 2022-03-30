package ds.nodes;

public class DoublyLinkedNode<T> {
    T data;
    DoublyLinkedNode<T> prev;
    DoublyLinkedNode<T> next;
   public DoublyLinkedNode(T data){
            this.data = data;
            prev = next = null;
        }
}
