package ds.nodes;

public class Node<T> {
    public T data;
    public Node<T> next;

    public Node(T data, Node<T> next_node) {
        this.data = data;
        next = next_node;
    }

    public Node(T data) {
        this.data = data;

    }
}
