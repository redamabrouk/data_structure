package ds.queues;

public interface Queue<T> {
     void enqueue(T element);
    T dequeue();
    int size();
}
