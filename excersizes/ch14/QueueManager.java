package gr.aueb.cf.OOPProjects.excersizes.ch14;

/**
 * A QueueManager singleton
 * that provides the basic queue functionality
 * of enqueue and dequeue with FIFO.
 */
public class QueueManager {

    private static QueueManager INSTANCE = null;

    private int[] queue;
    private int back;
    private int maxSize;

    private QueueManager(int size) {
        maxSize = size;
        queue = new int[maxSize];
        back = -1;
    }

    public static QueueManager getInstance(int size) {
        if (INSTANCE == null) {
            INSTANCE = new QueueManager(size);
        }

        return INSTANCE;
    }

    /**
     * Enqueues an integer at the back of the queue
     * @param item
     */
    public void enqueue(int item) {
        if (!isFull()) {
           queue[++back] = item;
        } else {
            System.out.printf("Stack is full, number %d cannot be pushed\n", item);
        }
    }

    /**
     * It dequeues the 1st int of the queue
     * (the integer in position [0])
     * and returns its value
     * @return
     */
    public int deQueue() {
        if (isEmpty()){
           throw new IllegalStateException("Queue is empty");
        }
        int popped = queue[0];
        shiftQueueLeft();
        return popped;
    }

    /**
     * It shifts the content of the queue to the left by 1
     * and turns the leftover value into a 0.
     */
    private void shiftQueueLeft() {
        for (int i = 0; i < back; i++) {
            queue[i] = queue[i+1];
        }
        queue[back] = 0;
        back--;
    }

    /**
     * Checks if the stack is full.
     * It's used in push
     * @return
     */
    private boolean isFull() {
        return back == maxSize -1;
    }

    /**
     * Checks if the stack is empty.
     * It's used in pop
     * @return
     */
    private boolean isEmpty() {
        return back == -1;
    }



}
