private static class Node<AnyType> {
    public Node(AnyType d, Node<AnyType> p, Node<AnyType> n) {
        data = d;
        prev = p;
        next = n;
    }

    public AnyType data;
    public Node<AnyType> prev;
    public Node<AnyType> next;
}
