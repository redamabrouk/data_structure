package ds.queues;

public class QueueArray<T> implements Queue<T> {

    private T[] queuearr;

    private int total, first, next;

    public QueueArray()
    {
        queuearr = (T[]) new Object[2];
    }

    private void resize(int capacity)
    {
        T[] tmp = (T[]) new Object[capacity];

        for (int i = 0; i < total; i++)
            tmp[i] = queuearr[(first + i) % queuearr.length];

            queuearr = tmp;
        first = 0;
        next = total;
    }

    @Override
    public QueueArray<T> enqueue(T ele)
    {
        if (queuearr.length == total) resize(queuearr.length * 2);
        queuearr[next++] = ele;
        if (next == queuearr.length) next = 0;
        total++;
        return this;
    }

    @Override
    public T dequeue()
    {
        if (total == 0) throw new java.util.NoSuchElementException();
        T ele = queuearr[first];
        queuearr[first] = null;
        if (++first == queuearr.length) first = 0;
        if (--total > 0 && total == queuearr.length / 4) resize(queuearr.length / 2);
        return ele;
    }

    @Override
    public int size(){
        return total;
    }
    
    @Override
    public String toString()
    {
        return java.util.Arrays.toString(queuearr);
    }

}