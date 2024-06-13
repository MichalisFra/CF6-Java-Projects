package gr.aueb.cf.OOPProjects.excersizes.ch14;

public class QueueMain {

    public static void main(String[] args) {
        // Initialize the queue with a maximum size of 5
        QueueManager queue = QueueManager.getInstance(5);

        // Test enqueuing elements
        System.out.println("Enqueuing elements:");
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        // Attempt to enqueue an element when the queue is full
        queue.enqueue(6); // This should print a message indicating the queue is full

        // Test dequeuing elements
        System.out.println("Dequeuing elements:");
        try {
            System.out.println("Dequeued item: " + queue.deQueue());
            System.out.println("Dequeued item: " + queue.deQueue());
            System.out.println("Dequeued item: " + queue.deQueue());
            System.out.println("Dequeued item: " + queue.deQueue());
            System.out.println("Dequeued item: " + queue.deQueue());

            // Attempt to dequeue from an empty queue
            System.out.println("Dequeued item: " + queue.deQueue()); // This should throw an exception
        } catch (IllegalStateException e) {
            System.err.println(e.getMessage());
        }
    }
}
