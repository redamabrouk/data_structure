import ds.queues.QueueArray;

public class TestQueueArray {

    /**
     * Main method
     *
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        QueueArray<Integer> myQueue = new QueueArray<Integer>();
        myQueue.enqueue(10);
        myQueue.enqueue(2);
        myQueue.enqueue(5);
        myQueue.enqueue(3);
        // [10(front), 2, 5, 3(rear)]
        System.out.println(myQueue.toString()); // Will print [2, 5, 3, 7]


        myQueue.dequeue(); // Will make 2 the new front, making 10 no longer part of the queue
        // [10, 2(front), 5, 3(rear)]
        myQueue.dequeue(); // Will make 2 the new front, making 10 no longer part of the queue

        System.out.println(myQueue.toString()); // Will print [2, 5, 3, 7]

        myQueue.enqueue(7); // Insert 7 at the rear which will get 0 index because of wrap around
        // [7(rear), 2(front), 5, 3]
        System.out.println(myQueue.toString()); // Will print [2, 5, 3, 7]

    }
}